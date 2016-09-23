package com.undp.repository;

import com.undp.jpa.UserLogon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by omib on 05/09/2016.
 */
@Repository
public interface UserLogonRepository extends CrudRepository<UserLogon,Long>
{
    public UserLogon findByUserName(String userName);
}
