package com.undp.jpa;

import com.undp.entity.BusinessType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by omib on 20/09/2016.
 */
@Entity
public class UserPersonalDetails
{
    @Id
    private String userId;
    @Column
    private String firstName;
    @Column
    private String middleName;
    @Column
    private String lastName;
    @Column
    private BusinessType businessType;
    @Column
    private String addressLine1;
    @Column
    private String addressLine2;
    
    protected UserPersonalDetails()
    {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly

    }



    public UserPersonalDetails(String userId, String firstName, String middleName,
                               String lastName, BusinessType businessType,
                               String addressLine1, String addressLine2) {
        this.userId = userId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.businessType = businessType;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }


    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public BusinessType getBusinessType() {
        return businessType;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }


    @Override
    public String toString() {
        return "UserPersonalDetails{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", businessType=" + businessType +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                '}';
    }
}
