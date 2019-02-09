package junit.homwork;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StringUtilityTest {

    StringUtility sut;

    @Before
    public void createSut() {

        sut= new StringUtility();
    }


    @Test
    public void camelCase() {
       String s = sut.camelCase("Hej jag heter Johan") ;
        Assert.assertEquals("HejJagHeterJohan",s);
    }

    @Test
    public void reverse() {
      String sr =  sut.reverse("Johan");
        Assert.assertEquals( "nahoJ",sr);

    }

    @Test
    public void isValidEmailAddress() {
      Boolean b =  sut.isValidEmailAddress("poojasolanki1205@gmail.com");
      Assert.assertTrue(b);


    }
}