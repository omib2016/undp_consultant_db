package com.undp.repository;

import com.undp.jpa.UserPersonalDetails;
import com.undp.jpa.UserProfessionalDetails;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by omib on 22/09/2016.
 */
public interface UserProfessionalDetailRepository extends CrudRepository<UserProfessionalDetails,Long>
{
    public UserProfessionalDetails findByUserId(String userId);
}
