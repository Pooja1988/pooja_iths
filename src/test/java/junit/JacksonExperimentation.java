package junit;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;
import junit.lab.atm.BankCard;
import org.junit.Test;
import se.iths.Pet;
import se.iths.Selenium.WebShop.Order;

import java.util.Collections;

public class JacksonExperimentation {

    @Test
    public void simpleSerialization() throws JsonProcessingException {

        BankCard myCard = new BankCard(
                "APA",
                2020,
                12
        );
        ObjectMapper mapper = new ObjectMapper();


    }


    @Test
    public void serializePet() throws JsonProcessingException {

        Pet fido = new Pet(
                123457,
                "Fido II",
                Collections.emptyList(),
                "available"


        );

        ObjectMapper mapper = new ObjectMapper();

        String fidoAsJson = mapper.writeValueAsString(fido);

        System.out.println(fidoAsJson);

    }

    @Test
    public void Order() throws JsonProcessingException {
        Order order = new Order(
                1,
                123457,
                2,
                "28-02-2019",
                "available"

        );

        ObjectMapper mapper = new ObjectMapper();
        String OrderAsJson = mapper.writeValueAsString(order);
        System.out.println(OrderAsJson);
    }


}





