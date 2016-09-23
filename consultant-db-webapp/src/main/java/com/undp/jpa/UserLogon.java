package com.undp.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by omib on 04/09/2016.
 */
@Entity
public class UserLogon
{
    @Id
    @GeneratedValue
    private String userId;
    @Column
    private final String userName;
    @Column
    private final String password;


    protected UserLogon()
    {
        this.userId="";
        this.userName="";
        this.password="";
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly
    }

    public UserLogon(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLogon userLogon = (UserLogon) o;

        if (!userId.equals(userLogon.userId)) return false;
        if (!userName.equals(userLogon.userName)) return false;
        return password.equals(userLogon.password);

    }

    @Override
    public int hashCode() {
        int result = userId.hashCode();
        result = 31 * result + userName.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UserLogon{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
