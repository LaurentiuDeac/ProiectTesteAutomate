package pages;

import helpMethods.ElementMethods;
import helpMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.elementMethods = new ElementMethods(this.driver);
        this.pageMethods = new PageMethods(this.driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "LoginUser")
    private WebElement user;
    @FindBy(xpath = "//a[text()='Log in']")
    private WebElement login;

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement register;





    public void hoverOnUser(){
        this.elementMethods.hoverElement(user);
    }
    public void clickOnLogin(){
        this.elementMethods.clickElement(login);
    }

    public void clickOnRegister(){
        this.elementMethods.clickElement(register);
    }







}
