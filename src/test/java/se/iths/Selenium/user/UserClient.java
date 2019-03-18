package se.iths.Selenium.user;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

import org.junit.Assert;
import se.iths.Selenium.WebShop.User;

public class UserClient {
    ObjectMapper mapper = new ObjectMapper();


    public void createUser(User myUser) throws JsonProcessingException {

        try{

            String UserAsJson = mapper.writeValueAsString(myUser);
            HttpResponse<JsonNode> postUserResponse = Unirest
                .post("petstore.swagger.io/v2")
                .header("Content-Type", "application/json")
                .body(UserAsJson)
                .asJson();
        Assert.assertEquals(100,postUserResponse.getStatus());
        }
        catch(Exception e){


        }



            



    }


    }

