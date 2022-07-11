package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class RegisterPage extends HomePage {


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordElement;


    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    private WebElement confirmPasswordElement;


    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountButton;

    public void createAccount(HashMap<String, String> testData){
        pageMethods.validateTitlePage(testData.get("registerPage"));
        elementMethods.fillElement(passwordElement, testData.get("password"));
        elementMethods.fillElement(confirmPasswordElement, testData.get("confirmPassword"));
        elementMethods.clickElement(createAccountButton);

    }





}