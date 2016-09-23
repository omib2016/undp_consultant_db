package com.undp.entity;

import com.undp.jpa.UserContactDetails;
import com.undp.jpa.UserLogon;
import com.undp.jpa.UserPersonalDetails;
import com.undp.jpa.UserProfessionalDetails;

/**
 * Created by omib on 20/09/2016.
 */
public class User
{
    private final UserLogon userLogon;
    private final UserPersonalDetails userPersonalDetails;
    private final UserProfessionalDetails userProfessionalDetails;
    private final UserContactDetails userContactDetails;


    public User(UserLogon userLogon, UserPersonalDetails userPersonalDetails, UserProfessionalDetails userProfessionalDetails,
                UserContactDetails userContactDetails)
    {
        this.userLogon = userLogon;
        this.userPersonalDetails = userPersonalDetails;
        this.userProfessionalDetails = userProfessionalDetails;
        this.userContactDetails = userContactDetails;
    }


    public UserLogon getUserLogon() {
        return userLogon;
    }

    public UserPersonalDetails getUserPersonalDetails() {
        return userPersonalDetails;
    }

    public UserProfessionalDetails getUserProfessionalDetails() {
        return userProfessionalDetails;
    }

    public UserContactDetails getUserContactDetails() {
        return userContactDetails;
    }

    @Override
    public String toString() {
        return "User{" +
                "userLogon=" + userLogon +
                ", userPersonalDetails=" + userPersonalDetails +
                ", userProfessionalDetails=" + userProfessionalDetails +
                ", userContactDetails=" + userContactDetails +
                '}';
    }
}
