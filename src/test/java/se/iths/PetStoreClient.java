package se.iths;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Assert;
import se.iths.Pet;
import se.iths.Selenium.user.User;

import java.util.Collections;
import java.util.List;

public class PetStoreClient {

    ObjectMapper mapper;

    public PetStoreClient() {
        mapper = new ObjectMapper();

    }

    public void deletePet(int id) {

        try {
            HttpResponse<String> deleteRsponse = Unirest.delete("https://swagger-petstore.azurewebsites.net/v2/pet/" + id).asString();

            Assert.assertEquals(
                    200,
                    deleteRsponse.getStatus()
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void createPet(Pet myPet) {

        try {
            String fidoAsJson = mapper.writeValueAsString(myPet);

            HttpResponse<JsonNode> postPetResponse = Unirest
                    .post("https://swagger-petstore.azurewebsites.net/v2/pet/")
                    .header("Content-Type", "application/json")
                    .body(fidoAsJson)
                    .asJson();

            Assert.assertEquals(200, postPetResponse.getStatus());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public Pet getPet(int id) {
        return getPet(id, 200);
    }

    public Pet getPet(int id, int expectedStatuscode) {

        try {

            HttpResponse<String> getPetResponse = Unirest
                    .get("https://swagger-petstore.azurewebsites.net/v2/pet/" + id)
                    .asString();

            Pet myPet = mapper.readValue(
                    getPetResponse.getBody(),
                    Pet.class
            );

            Assert.assertEquals(expectedStatuscode, getPetResponse.getStatus());

            return myPet;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void createUser(User user) {

        try {

            System.out.println(mapper.writeValueAsString(user));
            HttpResponse<JsonNode> postPetResponse = Unirest
                    .post("https://swagger-petstore.azurewebsites.net/v2/user/createWithList/")
                    .header("Content-Type", "application/json")
                    .body(mapper.writeValueAsString(Collections.singletonList(user)))
                    .asJson();

            Assert.assertEquals(200, postPetResponse.getStatus());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean logIn(String username, String password) {
        try {

            HttpResponse<String> postPetResponse = Unirest
                    .get("https://swagger-petstore.azurewebsites.net/v2/user/login")
                    .header("Content-Type", "application/json")
                    .queryString("user", username)
                    .queryString("password", password)
                    .asString();

            if (postPetResponse.getStatus() == 200) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Pet> getPetsByStatus(String status) {

        try {

            HttpResponse<String> findPetByStatusResponse = Unirest
                    .get("https://swagger-petstore.azurewebsites.net/v2/pet/findByStatus")
                    .header("Content-Type", "application/json")
                    .queryString("status", status)
                    .asString();

            if (findPetByStatusResponse.getStatus() == 200) {
                return mapper.readValue(
                        findPetByStatusResponse.getBody(),
                        new TypeReference<List<Pet>>(){}
                );
            } else {
                throw new RuntimeException("Expected status 200");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}






