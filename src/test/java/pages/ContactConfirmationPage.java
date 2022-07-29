package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactConfirmationPage extends HomePage{

    public ContactConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[@style='margin-top:30px;text-align:center;']")   //div[@class='page']/div[2]/h2
    private WebElement messageSent;

    public void validateMessage(){
        Assert.assertEquals("Your request was succesfully sent",messageSent.getText());
    }

}
