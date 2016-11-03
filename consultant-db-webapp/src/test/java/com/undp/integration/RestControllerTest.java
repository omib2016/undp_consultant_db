package com.undp.integration;

import com.undp.entity.*;
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

    private final RestTemplate restTemplate = new RestTemplate();

    @Test
    public void testSavingUser()
    {
        String url = "http://localhost:8080/saveUser";

        UserEntry.UserEntryBuilder userEntry = new UserEntry.UserEntryBuilder();
        userEntry.buildWithUserName("smithj");
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
        userEntry.buildWithCategoryName(Category.Administrative);
        userEntry.buildWithSubCategory(SubCategory.Technology);

        ResponseEntity<Boolean> responseEntity = restTemplate.postForEntity(url, userEntry.build(), Boolean.class);
        Assert.assertEquals(true,responseEntity.getBody().booleanValue());

    }

    @Test
    public void testGetUser()
    {
        String name="smithj";
        String url = "http://localhost:8080/getUser?name="+name;

        ResponseEntity<User> responseEntity = restTemplate.getForEntity(url, User.class);
        User user = responseEntity.getBody();
        Assert.assertNotNull(user);
        Assert.assertEquals("smithj",user.getUserLogon().getUserName());


    }

}
