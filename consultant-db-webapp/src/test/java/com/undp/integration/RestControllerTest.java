package com.undp.integration;

import com.undp.entity.Category;
import com.undp.entity.SubCategory;
import com.undp.entity.UserCountry;
import com.undp.entity.UserEntry;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static com.undp.entity.UserEntry.*;

/**
 * Created by omib on 22/09/2016.
 */

public class RestControllerTest
{
    @Test
    public void testSavingUser()
    {
        String url = "http://localhost:8080/saveUser";

        UserEntry.UserEntryBuilder userEntry = new UserEntry.UserEntryBuilder();
        userEntry.buildWithUserId("smithj");
        userEntry.buildWithPassword("password");
        userEntry.buildWithFirstName("John");
        userEntry.buildWithLastName("Smith");
        userEntry.buildWithAddressLine1("1 Park Avenue");
        userEntry.buildWithAddressLine2("NY");
        userEntry.buildWithCompanyName("UN");
        userEntry.buildWithEmailId("john.smith@gmail.com");
        userEntry.buildWithMobileNumber("212-567-9807");
        userEntry.buildWithState("NY");
        userEntry.buildWithFaxNumber("212-890-9999");
        userEntry.buildWithUserCountry(UserCountry.US);
        userEntry.buildWithCategoryName(Category.TEST);
        userEntry.buildWithSubCategory(SubCategory.TEST);


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Boolean> responseEntity = restTemplate.postForEntity(url, userEntry.build(), Boolean.class);
        Assert.assertEquals(true,responseEntity.getBody().booleanValue());

    }

}
