package com.undp.jpa;

import com.undp.entity.Category;
import com.undp.entity.SubCategory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by omib on 20/09/2016.
 */
@Entity
public class UserProfessionalDetails
{
    @Id
    private String userId;
    @Column
    private String companyName;
    @Column
    private Category category;
    @Column
    private SubCategory subCategory;

    protected UserProfessionalDetails()
    {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly.
    }

    public UserProfessionalDetails(String userId, String companyName, Category category, SubCategory subCategory)
    {
        this.userId = userId;
        this.companyName = companyName;
        this.category = category;
        this.subCategory = subCategory;
    }

    public String getUserId() {
        return userId;
    }


    public String getCompanyName() {
        return companyName;
    }

    public Category getCategory() {
        return category;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserProfessionalDetails that = (UserProfessionalDetails) o;

        if (!companyName.equals(that.companyName)) return false;
        if (category != that.category) return false;
        return subCategory == that.subCategory;

    }

    @Override
    public int hashCode() {
        int result = companyName.hashCode();
        result = 31 * result + category.hashCode();
        result = 31 * result + subCategory.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UserProfessionalDetails{" +
                "companyName='" + companyName + '\'' +
                ", category=" + category +
                ", subCategory=" + subCategory +
                '}';
    }

}
