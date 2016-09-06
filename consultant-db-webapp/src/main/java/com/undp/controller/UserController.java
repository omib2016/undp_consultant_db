package com.undp.controller;

import com.undp.entity.User;
import com.undp.service.UserService;
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

    public UserController(UserService userService)
    {
        this.userService = userService;
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


    @RequestMapping("/getStatus")
    public String getStatus()
    {
        return "UNDP Consultant database is running..";
    }

}
