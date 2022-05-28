package tests;

import org.testng.annotations.Test;
import pages.Automationexercise_com;
import utulities.Driver;

public class yazilacak {

    @Test
    public static void test01(){

        Automationexercise_com obj=new Automationexercise_com();

        Driver.getDriver().get("https://www.automationexercise.com/");

        obj.loginLinki.click();


    }
}
