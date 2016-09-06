package com.undp.service;

import com.undp.entity.User;

/**
 * Created by omib on 05/09/2016.
 */
public interface UserService
{
    public User getUserByName(String name);
    public void saveUser(User user);
}
