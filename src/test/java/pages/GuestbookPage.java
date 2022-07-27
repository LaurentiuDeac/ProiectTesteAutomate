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
    @FindBy(xpath = "//div[@class='g-recaptcha']")
    private WebElement checkBox;
    @FindBy(xpath ="//button[@class='btn btn-default']")
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

    public void sendMessage(HashMap<String, String> testData){
        elementMethods.clickElement(name);
        elementMethods.fillElement(name, testData.get("name"));
        elementMethods.clickElement(message);
        elementMethods.fillElement(message, testData.get("message"));
        elementMethods.clickElement(checkBox);
      //  elementMethods.clickElement(send);
    }

    public void  writeCommentWithoutName(HashMap<String, String> testData){
        elementMethods.clickElement(name);
        elementMethods.clickElement(message);
        elementMethods.fillElement(message, testData.get("message"));
        elementMethods.clickElement(checkBox);
        elementMethods.clickElement(send);
    }

    public void  writeCommentWithoutMessage(HashMap<String, String> testData){
        elementMethods.clickElement(name);
        elementMethods.fillElement(name, testData.get("name"));
        elementMethods.clickElement(message);
        elementMethods.clickElement(checkBox);
        elementMethods.clickElement(send);
    }







}
