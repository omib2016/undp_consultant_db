package com.undp.controller;

import com.undp.entity.User;
import com.undp.service.AdminService;
import com.undp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by omib on 04/09/2016.
 */
@RestController
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

    @RequestMapping("/getUser")
    public User getUser(@RequestParam(value="name") String name)
    {
        return userService.getUserByName(name);
    }

    @RequestMapping("/saveUser")
    public void saveUser(User user)
    {
        userService.saveUser(user);
    }

    //TODO: Move this function to its own controller.
    @RequestMapping("/home")
    public String getHomePage()
    {
        return "UNICMS Home page.";
    }

    @RequestMapping("/getStatus")
    public String getStatus()
    {
        if (adminService.getSystemStatus() == 1)
            return "UNICMS is up & running!";
        else
            return "Error initializing database. Please check application logs..";

    }

}
