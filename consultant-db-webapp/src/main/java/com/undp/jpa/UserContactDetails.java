package com.undp.jpa;

import com.undp.entity.UserCountry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by omib on 20/09/2016.
 */
@Entity
public class UserContactDetails
{
    @Id
    private String userId;
    @Column
    private String emailId;
    @Column
    private String mobileNumber;
    @Column
    private String landlineNumber;
    @Column
    private String faxNumber;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private UserCountry country;

    protected UserContactDetails()
    {

    }


    public UserContactDetails(String userId, String emailId, String mobileNumber,
                              String landlineNumber, String faxNumber, String city,
                              String state, UserCountry country)
    {
        this.userId = userId;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.landlineNumber = landlineNumber;
        this.faxNumber = faxNumber;
        this.city = city;
        this.state = state;
        this.country = country;
    }


    public String getUserId() {
        return userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public UserCountry getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserContactDetails that = (UserContactDetails) o;

        if (!userId.equals(that.userId)) return false;
        if (!emailId.equals(that.emailId)) return false;
        if (!mobileNumber.equals(that.mobileNumber)) return false;
        if (!landlineNumber.equals(that.landlineNumber)) return false;
        if (!faxNumber.equals(that.faxNumber)) return false;
        if (!city.equals(that.city)) return false;
        if (!state.equals(that.state)) return false;
        return country == that.country;

    }

    @Override
    public int hashCode() {
        int result = userId.hashCode();
        result = 31 * result + emailId.hashCode();
        result = 31 * result + mobileNumber.hashCode();
        result = 31 * result + landlineNumber.hashCode();
        result = 31 * result + faxNumber.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + country.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UserContactDetails{" +
                "userId='" + userId + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", landlineNumber='" + landlineNumber + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country=" + country +
                '}';
    }
}
