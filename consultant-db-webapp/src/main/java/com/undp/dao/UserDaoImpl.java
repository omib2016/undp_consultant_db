package com.undp.dao;

import com.undp.entity.UserEntry;
import com.undp.jpa.UserContactDetails;
import com.undp.jpa.UserLogon;
import com.undp.jpa.UserPersonalDetails;
import com.undp.jpa.UserProfessionalDetails;
import com.undp.repository.UserContactRepository;
import com.undp.repository.UserLogonRepository;
import com.undp.repository.UserPersonalDetailRepository;
import com.undp.repository.UserProfessionalDetailRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by omib on 22/09/2016.
 */
public class UserDaoImpl implements UserDao
{
    private final UserLogonRepository userLogonRepository;
    private final UserContactRepository userContactRepository;
    private final UserPersonalDetailRepository userPersonalDetailRepository;
    private final UserProfessionalDetailRepository userProfessionalDetailRepository;

    public UserDaoImpl(UserLogonRepository userLogonRepository, UserContactRepository userContactRepository,
                       UserPersonalDetailRepository userPersonalDetailRepository, UserProfessionalDetailRepository userProfessionalDetailRepository)
    {
        this.userLogonRepository = userLogonRepository;
        this.userContactRepository = userContactRepository;
        this.userPersonalDetailRepository = userPersonalDetailRepository;
        this.userProfessionalDetailRepository = userProfessionalDetailRepository;
    }


    @Override
    @Transactional
    public boolean saveUser(UserEntry userEntry)
    {
        UserLogon userLogon = new UserLogon(userEntry.getUsername(),userEntry.getPassword());
        userLogonRepository.save(userLogon);
        userPersonalDetailRepository.save(new UserPersonalDetails(userLogon.getUserId(),userEntry.getFirstName(),
                userEntry.getMiddleName(),userEntry.getLastName(),userEntry.getBusinessType(),userEntry.getAddressLine1(),
                userEntry.getAddressLine2()));
        userContactRepository.save(new UserContactDetails(userLogon.getUserId(),userEntry.getEmailId(),
                userEntry.getMobileNumber(),userEntry.getLandlineNumber(),userEntry.getFaxNumber(),
                userEntry.getCity(),userEntry.getState(),userEntry.getCountry()));
        userProfessionalDetailRepository.save(new UserProfessionalDetails(userLogon.getUserId(),
                userEntry.getCompanyName(),userEntry.getCategory(),userEntry.getSubCategory()));

        //TODO: check save ALL & then return true.
        return true;

    }
}
