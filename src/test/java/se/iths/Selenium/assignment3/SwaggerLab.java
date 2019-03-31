package se.iths.Selenium.assignment3;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Assert;
import org.junit.Test;

public class SwaggerLab {

    @Test
    public void createUserWithCorrectUserDetails() throws UnirestException {

        HttpResponse<String> createUser = Unirest.post
                ("https://swagger-petstore.azurewebsites.net/v2/user")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"id\": 10,\n" +
                        "  \"username\": \"ps\",\n" +
                        "  \"firstName\": \"Pooja\",\n" +
                        "  \"lastName\": \"Rathore\",\n" +
                        "  \"email\": \"Poojasolanki\",\n" +
                        "  \"password\": \"sunny\",\n" +
                        "  \"phone\": \"00999\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .asString();
        Assert.assertEquals(200,
                createUser.getStatus());
        HttpResponse<String> userLogin = Unirest.get
                ("https://swagger-petstore.azurewebsites.net/v2/user/login")
                .asString();
        Assert.assertEquals(200,
                userLogin.getStatus());


    }

    @Test
    public void createUserWithWrongPassword() throws UnirestException {

        HttpResponse<String> createUser1 = Unirest.post
                ("https://swagger-petstore.azurewebsites.net/v2/user")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"id\": 10,\n" +
                        "  \"username\": \"ps\",\n" +
                        "  \"firstName\": \"Pooja\",\n" +
                        "  \"lastName\": \"Rathore\",\n" +
                        "  \"email\": \"Poojasolanki\",\n" +
                        "  \"password\": \"sunny\",\n" +
                        "  \"phone\": \"00999\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .asString();
        Assert.assertEquals(200,
                createUser1.getStatus());

        HttpResponse<String> userLoginWithWrongPwd = Unirest.get
                ("https://swagger-petstore.azurewebsites.net/v2/user/login?username=ps&password=test")
                .asString();
        Assert.assertEquals(400,
                userLoginWithWrongPwd.getStatus());


    }

    @Test
    public void createMultipleUserDetails() throws UnirestException {
        HttpResponse<JsonNode> createMultipleUserDetails = Unirest.post("https://swagger-petstore.azurewebsites.net/v2/user/createWithList")
                .header("Content-Type", "application/json")
                .body("[\n" +
                        "  {\n" +
                        "    \"id\": 10,\n" +
                        "    \"username\": \"ps\",\n" +
                        "    \"firstName\": \"Pooja\",\n" +
                        "    \"lastName\": \"Rathore\",\n" +
                        "    \"email\": \"poojasolanki\",\n" +
                        "    \"password\": \"sunny\",\n" +
                        "    \"phone\": \"00999\",\n" +
                        "    \"userStatus\": 0\n" +
                        "  }\n" +
                        "  ,\n" +
                        "  {\n" +
                        "    \"id\": 11,\n" +
                        "    \"username\": \"Sp\",\n" +
                        "    \"firstName\": \"Sunny\",\n" +
                        "    \"lastName\": \"Rathore\",\n" +
                        "    \"email\": \"sandeeprathore\",\n" +
                        "    \"password\": \"pass\",\n" +
                        "    \"phone\": \"005555\",\n" +
                        "    \"userStatus\": 0\n" +
                        "  }\n" +
                        "]")
                .asJson();
        Assert.assertEquals(200,
                createMultipleUserDetails.getStatus());

     HttpResponse<String> MultipleUserLogin = Unirest.get
            ("https://swagger-petstore.azurewebsites.net/v2/user/login")
            .asString();
     Assert.assertEquals(200,
             MultipleUserLogin.getStatus());

     HttpResponse<String> DelUser10=Unirest.delete("https://swagger-petstore.azurewebsites.net/v2/user/ps")
             .asString();
     Assert.assertEquals(200,
            DelUser10.getStatus());

        HttpResponse<String> DelUser11=Unirest.delete("https://swagger-petstore.azurewebsites.net/v2/user/:sp")
                .asString();
        Assert.assertEquals(404,
                DelUser11.getStatus());



}
@Test
    public void UpdateEmail() throws UnirestException{

    HttpResponse<String> createUser = Unirest.post
            ("https://swagger-petstore.azurewebsites.net/v2/user")
            .header("Content-Type", "application/json")
            .body("{\n" +
                    "  \"id\": 10,\n" +
                    "  \"username\": \"ps\",\n" +
                    "  \"firstName\": \"Pooja\",\n" +
                    "  \"lastName\": \"Rathore\",\n" +
                    "  \"email\": \"Poojasolanki\",\n" +
                    "  \"password\": \"sunny\",\n" +
                    "  \"phone\": \"00999\",\n" +
                    "  \"userStatus\": 0\n" +
                    "}")
            .asString();
     Assert.assertEquals(200,
             createUser.getStatus());

     HttpResponse<String> UpdateEmail = Unirest.put("https://swagger-petstore.azurewebsites.net/v2/user/sp")
             .header("Content-Type","application/json")
             .body("{\n" +
                     "  \"id\": 10,\n" +
                     "  \"username\": \"ps\",\n" +
                     "  \"firstName\": \"Pooja\",\n" +
                     "  \"lastName\": \"Rathore\",\n" +
                     "  \"email\": \"poojarathore\",\n" +
                     "  \"password\": \"sunny\",\n" +
                     "  \"phone\": \"00999\",\n" +
                     "  \"userStatus\": 0\n" +
                     "}")
             .asString();
     Assert.assertEquals(200,
             UpdateEmail.getStatus());
     HttpResponse<String> UpdatedUser = Unirest.get("https://swagger-petstore.azurewebsites.net/v2/user/ps")
             .asString();
     Assert.assertEquals(200,
           UpdatedUser.getStatus() );
}}

