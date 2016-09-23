package com.undp.repository;

import com.undp.jpa.UserContactDetails;
import com.undp.jpa.UserLogon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by omib on 05/09/2016.
 */
@Repository
public interface UserContactRepository extends CrudRepository<UserContactDetails,Long>
{
    public UserContactDetails findByUserId(String userId);
}
