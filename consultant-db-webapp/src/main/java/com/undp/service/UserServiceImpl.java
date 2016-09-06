package com.undp.service;

import com.undp.entity.User;
import com.undp.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by omib on 05/09/2016.
 */
@Service
public class UserServiceImpl implements UserService
{
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }


    @Override
    public User getUserByName(String name)
    {
        return userRepository.findByUserName(name);
    }

    @Override
    public void saveUser(User user)
    {
        userRepository.save(user);
    }


}
