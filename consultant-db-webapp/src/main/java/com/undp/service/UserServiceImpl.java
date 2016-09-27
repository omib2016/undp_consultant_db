package com.undp.service;

import com.undp.entity.User;
import com.undp.entity.UserEntry;
import com.undp.jpa.UserContactDetails;
import com.undp.jpa.UserLogon;
import com.undp.jpa.UserPersonalDetails;
import com.undp.jpa.UserProfessionalDetails;
import com.undp.repository.UserContactRepository;
import com.undp.repository.UserLogonRepository;
import com.undp.repository.UserPersonalDetailRepository;
import com.undp.repository.UserProfessionalDetailRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by omib on 05/09/2016.
 */
@Service
public class UserServiceImpl implements UserService
{
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final UserLogonRepository userLogonRepository;
    private final UserContactRepository userContactRepository;
    private final UserPersonalDetailRepository userPersonalDetailRepository;
    private final UserProfessionalDetailRepository userProfessionalDetailRepository;

    @Autowired
    public UserServiceImpl(UserLogonRepository userRepository, UserContactRepository userContactRepository, UserPersonalDetailRepository userPersonalDetailRepository, UserProfessionalDetailRepository userProfessionalDetailRepository)
    {
        this.userLogonRepository = userRepository;
        this.userContactRepository = userContactRepository;
        this.userPersonalDetailRepository = userPersonalDetailRepository;
        this.userProfessionalDetailRepository = userProfessionalDetailRepository;
    }


    @Override
    public User getUserByName(String name)
    {
        UserLogon userLogon = userLogonRepository.findByuserName(name);
        UserContactDetails userContact = userContactRepository.findByUserId(userLogon.getUserId());
        UserPersonalDetails userPersonalDetails = userPersonalDetailRepository.findByUserId(userLogon.getUserId());
        UserProfessionalDetails userProfessionalDetails = userProfessionalDetailRepository.findByUserId(userLogon.getUserId());

        return new User(userLogon,userPersonalDetails,userProfessionalDetails,userContact);

    }

    @Override
    @Transactional
    public boolean saveUser(UserEntry userEntry)
    {
        UserLogon userLogon = new UserLogon(userEntry.getUserName(),userEntry.getPassword());
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
