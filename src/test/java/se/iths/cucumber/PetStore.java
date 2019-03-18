package se.iths.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.Vehicle;
import org.junit.Assert;
import se.iths.Pet;
import se.iths.PetStoreClient;

import java.util.Collections;
import java.util.List;

public class PetStore {

    @Given("a pet with id {int}")
    public void a_pet_with_id( int petId) throws Throwable {

        Pet myPet = new Pet(
                petId,
                "Kjell",
                Collections.emptyList(),
                "available"
        );

     new PetStoreClient().createPet(myPet);

    }

    @When("i delete the pet with id {int}")
    public void i_delete_the_pet_with_id(Integer int1) throws Throwable {

        new PetStoreClient().deletePet(int1);
    }

    @When("I create a pet with id {int}")
    public void i_create_a_pet_with_id(Integer int2) throws Throwable{

        Pet myPet = new Pet(int2,
                "tomy",
                Collections.emptyList(),
                "available");
       new PetStoreClient().createPet(myPet);
    }

    @Then("I can get the pet with id {int}")
    public void i_can_get_the_pet_with_id(Integer int2) throws Throwable{
        new PetStoreClient().getPet(int2);

    }

    @Given("A pet with status {string} and id {int}")
    public void a_pet_with_status_and_id(String string, Integer int3) {

        Pet myPet = new Pet(int3,
                "ruby",
                Collections.emptyList(),
                "available");
        new PetStoreClient().createPet(myPet);

    }

    List<Pet> pets ;

    @When("I fetch pets by status {string}")
    public void i_fetch_pets_by_status(String string) {


        pets = new PetStoreClient().getPetsByStatus("available");
    }

    @Then("a pet with id {int} will be in the response")
    public void a_pet_with_id_will_be_in_the_response(Integer int1) {

        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getId() == int1) {
                return;
            }

            Assert.fail();
        }


        }





    }

























