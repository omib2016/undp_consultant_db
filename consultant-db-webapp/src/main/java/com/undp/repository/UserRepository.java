package com.undp.repository;

import com.undp.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by omib on 05/09/2016.
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long>
{
    public User findByUserName(String userName);
}
