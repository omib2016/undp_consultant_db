package com.undp.controller;

import com.undp.entity.UserEntry;
import com.undp.jpa.UserLogon;
import com.undp.service.AdminService;
import com.undp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by omib on 04/09/2016.
 */
@Controller
public class UserController
{
    private final UserService userService;
    private final AdminService adminService;

    @Autowired
    public UserController(UserService userService, AdminService adminService)
    {
        this.userService = userService;
        this.adminService = adminService;
    }

    @GetMapping("/getUser")
    public UserLogon getUser(@RequestParam(value="name") String name)
    {
        return userService.getUserByName(name);
    }

    @PostMapping("/saveUser")
    public ResponseEntity<Boolean> saveUser(@RequestBody UserEntry userEntry)
    {
        boolean response = userService.saveUser(userEntry);
        return new ResponseEntity<Boolean>(response, HttpStatus.OK);
    }

    //TODO: Move this function to its own controller.
    @RequestMapping("/")
    public String home()
    {
        return "home";
    }

    @RequestMapping("/getStatus")
    public String getStatus(Model model)
    {
        if (adminService.getSystemStatus() == 1)
            return "status";
        else
            return "Error initializing database. Please check application logs..";

    }

}
