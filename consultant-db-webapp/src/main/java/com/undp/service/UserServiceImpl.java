package com.undp.service;

import com.undp.entity.User;
import com.undp.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by omib on 05/09/2016.
 */
public class UserServiceImpl implements UserService
{
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }


    @Override
    public User getUserByName(String name)
    {
        return userRepository.findByName(name);
    }

    @Override
    public void saveUser(User user)
    {
        userRepository.save(user);
    }


}
