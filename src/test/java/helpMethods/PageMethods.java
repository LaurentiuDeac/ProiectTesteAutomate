package helpMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageMethods {

    public WebDriver driver;

    public PageMethods (WebDriver driver) {
        this.driver = driver;
    }

    public void validateTitlePage(String titlePage) {
        String actualTitlePage = this.driver.getTitle();
        Assert.assertEquals("The displayed page is not the expected one", titlePage, actualTitlePage);
    }

    public void navigateToUrl(String url) {
        this.driver.navigate().to(url);
    }

    public void validateMessage(WebElement element, String message){
        String actualMessage=element.getText();
        Assert.assertEquals("Text message is not correct",  message, actualMessage);
    }


}
