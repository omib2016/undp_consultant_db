package com.undp.dao;

import com.undp.entity.UserEntry;

/**
 * Created by omib on 22/09/2016.
 */
public interface UserDao
{
    public boolean saveUser(UserEntry userEntry);
}
