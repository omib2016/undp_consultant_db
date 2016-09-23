package com.undp.repository;

import com.undp.jpa.UserContactDetails;
import com.undp.jpa.UserPersonalDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by omib on 05/09/2016.
 */
@Repository
public interface UserPersonalDetailRepository extends CrudRepository<UserPersonalDetails,Long>
{
    public UserPersonalDetails findByUserId(String userId);
}
