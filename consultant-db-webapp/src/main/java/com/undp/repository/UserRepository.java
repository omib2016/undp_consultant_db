package com.undp.repository;

import com.undp.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by omib on 05/09/2016.
 */
public interface UserRepository extends CrudRepository<User,Long>
{
    public User findByName(String name);
}
