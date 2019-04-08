package junit.sprint1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StoreTest {

    private Store sut;

    @Before
    public void createSut() {
        sut= new Store();
        sut.learnResponse("test","test");
    }

    @Test
    public void getResponse() {
        String s = sut.getResponse("test");
        Assert.assertNotNull(s);
        Assert.assertEquals(s,"test");
    }

    @After
    public void unlearnAll() {
        sut.unlearnAll();
    }
}