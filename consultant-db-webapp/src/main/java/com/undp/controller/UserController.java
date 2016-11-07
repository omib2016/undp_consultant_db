package com.undp.controller;

import com.undp.entity.LogonEntry;
import com.undp.entity.User;
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
    public ResponseEntity<User> getUser(@RequestParam(value="name") String name)
    {
        User user = userService.getUserByName(name);
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute UserEntry userEntry)
    {
        System.out.println(userEntry);
        boolean response = userService.saveUser(userEntry);
        return "saveuser";
    }


    //TODO: Move this function to its own controller.
    @RequestMapping("/")
    public String home()
    {
        return "home";
    }

    @RequestMapping("/loginUser")
    public String loginUser(@ModelAttribute LogonEntry userLogon)
    {
        if (userLogon.getUsername().equalsIgnoreCase("admin@undp.com") && userLogon.getPassword().equals("password"))
        {
            return "adminlogin";
        }
        else
        {
            return "errorlogin";
        }


    }

    @RequestMapping("/login")
    public String login(Model model)
    {
        model.addAttribute("logonentry",new LogonEntry());
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model)
    {
        model.addAttribute("userentry",new UserEntry());
        return "register";
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
