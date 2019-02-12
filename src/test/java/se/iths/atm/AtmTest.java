package se.iths.atm;

import junit.lab.atm.BankService;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

import junit.lab.atm.AutomaticTellerMachine;
import junit.lab.atm.BankCard;
import junit.lab.atm.BankService;
import org.junit.Assert;
import org.junit.Before;

public class AtmTest {

    BankService bankService;

    AutomaticTellerMachine atm;

    @Before
    public void createAtm() {

        atm = new AutomaticTellerMachine();
        bankService = new BankService();
        atm.setBankService(bankService);
    }

    @org.junit.Test
    public void insertCardAndCancelTransaction() {

        BankCard myCard = new BankCard("122131231", 2019, 10);
        atm.insertCard(myCard);
        atm.cancelTransaction();

        Assert.assertEquals(atm.getCurrentMenu(), AutomaticTellerMachine.CurrentMenu.welcomeScreen);


    }


    @org.junit.Test
    public void insufficientAmount() {

        BankService myFakeBank = Mockito.mock(BankService.class);

        Mockito.when(
                myFakeBank.isPinValid(any(), eq("1234"))

        ).thenReturn(true);

        atm.setBankService(myFakeBank);

        BankCard myCard = new BankCard("12344325234987", 2019, 10);
        atm.insertCard(myCard);
        atm.insertPin("1234");

        try {
            atm.withdrawAmount(1000);

        } catch (RuntimeException e) {
            System.out.println(e);
        }


    }


}





