package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class LoginPage extends HomePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement emailElement;

    @FindBy(xpath = "//button[text()='Continue']")
    private WebElement continueButton;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordElement;

    @FindBy(css = "label[for='RememberMe']")
    private WebElement rememberMeCheckBox;

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement loginElement;

    @FindBy(xpath="//div[@class='alert text-danger alert-danger validation-summary validation-summary-errors']/ul/li")
    private WebElement errorMessageElement;

    @FindBy(id = "Email-error")
    private WebElement wrongEmailElement;



    public void login(HashMap<String, String> testData){
        pageMethods.validateTitlePage(testData.get("loginPage"));
        elementMethods.fillElement(emailElement, testData.get("email"));
        elementMethods.clickElement(continueButton);
        elementMethods.fillElement(passwordElement, testData.get("password"));
        elementMethods.clickElement(rememberMeCheckBox);
        elementMethods.clickElement(loginElement);
    }

    public void loginWithWrongPassword(HashMap<String, String> testData){
        pageMethods.validateTitlePage(testData.get("loginPage"));
        elementMethods.fillElement(emailElement, testData.get("email"));
        elementMethods.clickElement(continueButton);
        elementMethods.fillElement(passwordElement, testData.get("wrongPassword"));
        elementMethods.clickElement(loginElement);
        pageMethods.validateMessage(errorMessageElement, testData.get("errorMessage"));
    }

    public void  loginWithWrongEmail(HashMap<String, String> testData){
        pageMethods.validateTitlePage(testData.get("loginPage"));
        elementMethods.fillElement(emailElement,testData.get("wrongEmail"));
        elementMethods.clickElement(continueButton);
        pageMethods.validateMessage(wrongEmailElement, testData.get("errorMessage2"));

    }

    public void fillEmailAndContinue(HashMap<String, String> testData) {
        elementMethods.fillElement(emailElement, testData.get("email"));
        elementMethods.clickElement(continueButton);
    }



}




