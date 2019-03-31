package se.iths.cucumber;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import se.iths.PetStoreClient;
import se.iths.Selenium.user.User;



public class Cucumberlab {

    @Given("I have a user")
    public void i_have_a_user() throws UnirestException {

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


    @When("enter right user name and password")
    public void enter_right_user_name_and_password() throws UnirestException {

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
                ("https://petstore.swagger.io/v2/user/login?username=ps&password=sunny")
                .asString();
        Assert.assertEquals(200,
                userLoginWithWrongPwd.getStatus());
    }

    @When("enter right user name and wrong password")
    public void enter_right_user_name_and_wrong_password() throws UnirestException {


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
                ("https://petstore.swagger.io/v2/user/login?username=ps&password=test")
                .asString();
        Assert.assertEquals(200,
                userLoginWithWrongPwd.getStatus());

    }


    @Then("create multiple user")
    public void create_multiple_user() throws UnirestException {
        HttpResponse<JsonNode> createMultipleUserDetails = Unirest.post("https://petstore.swagger.io/v2/user/createWithList")
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
                        ",\n" +
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
        Assert.assertEquals(00,
                00);
        createMultipleUserDetails.getStatus();

        HttpResponse<String> MultipleUserLogin = Unirest.get
                ("https://swagger-petstore.azurewebsites.net/v2/user/login")
                .asString();
        Assert.assertEquals(200,
                MultipleUserLogin.getStatus());

        HttpResponse<String> DelUser10=Unirest.delete("https://petstore.swagger.io/v2/user/ps")
                .asString();
        Assert.assertEquals(500,
                DelUser10.getStatus());

        HttpResponse<String> DelUser11=Unirest.delete("https://petstore.swagger.io/v2/user/:sp")
                .asString();
        Assert.assertEquals(500,
                DelUser11.getStatus());



    }

    @Then("create user with updated email")
    public void create_user_with_updated_email() throws UnirestException {

        HttpResponse<String> UserInfo=   Unirest.post("https://petstore.swagger.io/v2/user")

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
        Assert.assertEquals(500,
                UserInfo.getStatus());

        HttpResponse<String> UpdateEmail = Unirest.put("https://petstore.swagger.io/v2/user/sp")
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
        Assert.assertEquals(500,
                UpdateEmail.getStatus());
        HttpResponse<String> UpdatedUser = Unirest.get("https://petstore.swagger.io/v2/user/ps")
                .asString();
        Assert.assertEquals(500,
                UpdatedUser.getStatus() );

    }



}