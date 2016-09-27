package com.undp.repository;

import com.undp.jpa.UserPersonalDetails;
import com.undp.jpa.UserProfessionalDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by omib on 22/09/2016.
 */
@Repository
public interface UserProfessionalDetailRepository extends CrudRepository<UserProfessionalDetails,Long>
{
    public UserProfessionalDetails findByUserId(String userId);
}
