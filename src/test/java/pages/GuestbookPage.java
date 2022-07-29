package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class GuestbookPage extends HomePage{
    public GuestbookPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement name;
    @FindBy(xpath = "//textarea[@placeholder='Message']")
    private WebElement message;
    @FindBy(xpath = "//div[@data-sitekey='6Led7RsUAAAAAB5GjZqyszdSBpDkUizeusCwl1vX']")
    private WebElement checkBox;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    private WebElement captchaCheckBox;
    @FindBy(xpath ="//button[@type='submit']")
    private  WebElement send;
    @FindBy(xpath = "//a[@aria-label='dismiss cookie message']")
    private WebElement buttonAccept;



    public void clickAccept(){
        this.elementMethods.clickElement(buttonAccept);
    }
    public void clickSend(){
        this.elementMethods.clickElement(send);
    }
    public void clickCheckBox(){
        this.elementMethods.clickElement(checkBox);
    }
    public void clickMessage(){
        this.elementMethods.clickElement(message);
    }
    public void clickName(){
        this.elementMethods.clickElement(name);
    }

    public void sendMessage(HashMap<String, String> testData) throws InterruptedException {
        elementMethods.clickElement(name);
        elementMethods.fillElement(name, testData.get("name"));
        elementMethods.clickElement(message);
        elementMethods.fillElement(message, testData.get("message"));
        elementMethods.clickElement(buttonAccept);
        elementMethods.clickElement(checkBox);
        solveCaptcha();
        elementMethods.clickElement(send);
    }

    public void  writeCommentWithoutName(HashMap<String, String> testData) throws InterruptedException {
        elementMethods.clickElement(name);
        elementMethods.clickElement(message);
        elementMethods.fillElement(message, testData.get("message"));
        elementMethods.clickElement(buttonAccept);
        elementMethods.clickElement(checkBox);
        solveCaptcha();
        elementMethods.clickElement(send);
    }

    public void  writeCommentWithoutMessage(HashMap<String, String> testData) throws InterruptedException {
        elementMethods.clickElement(name);
        elementMethods.fillElement(name, testData.get("name"));
        elementMethods.clickElement(message);
        elementMethods.clickElement(buttonAccept);
        elementMethods.clickElement(checkBox);
        solveCaptcha();
        elementMethods.clickElement(send);
    }



    //V1.
    //driver.findElement(By.className("button-holder help-button-holder")).click();
    //driver.findElement(By.xpath("//button[@id='solver-button']")).click();

    //V2.
    //driver.findElement(By.className("button-holder help-button-holder")).click();
    //Actions act = new Actions(driver);
    //act.sendKeys(Keys.TAB);
    //act.click();

}
