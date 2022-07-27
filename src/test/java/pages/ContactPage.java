package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class ContactPage extends HomePage{
    public ContactPage(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement name;
    @FindBy(xpath = "//input[@placeholder='Phone']")
    private WebElement phone;
    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement email;
    @FindBy(xpath = "//input[@placeholder='Locality']")
    private WebElement locality;
    @FindBy(xpath = "//input[@placeholder='Company']")
    private WebElement company;
    @FindBy(xpath = "//textarea[@placeholder='Message']")
    private WebElement message;
    @FindBy(xpath = "//div[@class='g-recaptcha']")
    private WebElement checkBox;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement send;
    @FindBy(xpath = "//ul/li/a[@href='/en/about-us']")
    private WebElement aboutUs;
    @FindBy(xpath = "//a[@href='/en/gdpr-en']")
    private WebElement gdpr;
    @FindBy(xpath = "//a[@aria-label='dismiss cookie message']")
    private WebElement buttonAccept;
    @FindBy(xpath = "//button[@class='rc-button-default goog-inline-block']")
    private  WebElement skip;



    public void clickSkip(){
        this.elementMethods.clickElement(skip);
    }
    public void clickAccept(){
        this.elementMethods.clickElement(buttonAccept);
    }
    public void clickName(){
        this.elementMethods.clickElement(name);
    }
    private void clickPhone(){
        this.elementMethods.clickElement(phone);
    }
    public void clickEmail(){
        this.elementMethods.clickElement(email);
    }
    public  void clickLocality(){
        this.elementMethods.clickElement(locality);
    }
    public void clickCompany(){
        this.elementMethods.clickElement(company);
    }
    public void clickMessage(){
        this.elementMethods.clickElement(message);
    }
    private void clickCheckbox(){
        this.elementMethods.clickElement(checkBox);
    }
    private void clickSend(){
        this.elementMethods.clickElement(send);
    }
    public void clickAboutUs(){
        //elementMethods.scrollIntoViewElement(aboutUs);
        this.elementMethods.clickJsElement(aboutUs);
    }

    public void clickgdpr(){
        //elementMethods.scrollIntoViewElement(gdpr);
        this.elementMethods.clickJsElement(gdpr);
    }


    public void sendContactMessage(HashMap<String, String> testData) {
        elementMethods.clickElement(name);
        elementMethods.fillElement(name, testData.get("name"));
        elementMethods.clickElement(phone);
        elementMethods.fillElement(phone, testData.get("phone"));
        elementMethods.clickElement(email);
        elementMethods.fillElement(email,testData.get("email"));
        elementMethods.clickElement(locality);
        elementMethods.fillElement(locality,testData.get("locality"));
        elementMethods.clickElement(company);
        elementMethods.fillElement(company,testData.get("company"));
        elementMethods.clickElement(message);
        elementMethods.fillElement(message, testData.get("message"));
        elementMethods.clickElement(checkBox);
        elementMethods.clickElement(send);

    }




}
