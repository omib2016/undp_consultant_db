package com.undp.controller;

import com.undp.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by omib on 04/09/2016.
 */
@RestController
public class UserController
{
    @RequestMapping("/getUser")
    public User getUser(@RequestParam(value="name") String name)
    {
        return new User("testId",name);
    }

    @RequestMapping("/getStatus")
    public String getStatus()
    {
        return "UNDP Consultant database is running..";
    }

}
