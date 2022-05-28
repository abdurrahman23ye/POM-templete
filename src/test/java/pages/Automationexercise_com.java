package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class Automationexercise_com {

   public Automationexercise_com(){

       PageFactory.initElements(Driver.getDriver(),this);

   }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginLinki;
}
