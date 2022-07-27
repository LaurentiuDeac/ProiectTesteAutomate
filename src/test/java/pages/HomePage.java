package pages;

import helpMethods.ElementMethods;
import helpMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
    @FindBy(css="div[class='collapse navbar-collapse js-navbar-collapse']")
    private WebElement cars;
    @FindBy(xpath="//nav[@id='navigation']/ul/li/a[@href='/en/guestbook-en']")
    private WebElement guestbook;
    @FindBy(xpath = "//nav[@id='navigation']/ul/li/a[@href='/en/contact-en']")
    private WebElement contact;




    public void hoverOnUser(){
        this.elementMethods.hoverElement(user);
    }
    public void clickOnLogin(){
        this.elementMethods.clickElement(login);
    }
    public void clickOnRegister(){
        this.elementMethods.clickElement(register);
    }
    public void  clickOnCars(){
        this.elementMethods.clickElement(cars);
    }
    public void clickOnGuestbook() {
        this.elementMethods.clickElement(guestbook);
    }
    public void clickOnContact(){
        this.elementMethods.clickElement(contact);
    }
    public void closeWindow() {
        this.driver.close();
    }
    public void waitForPage(String  page){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.titleIs(page));
    }

}
