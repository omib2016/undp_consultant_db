package com.undp.service;

import com.undp.entity.User;
import com.undp.entity.UserEntry;
import com.undp.jpa.UserLogon;

/**
 * Created by omib on 05/09/2016.
 */
public interface UserService
{
    public User getUserByName(String name);
    public boolean saveUser(UserEntry userEntry);
}
