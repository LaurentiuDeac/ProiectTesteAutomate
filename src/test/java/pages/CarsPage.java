package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsPage  extends HomePage{
    public CarsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div[class='atribute-title TitleSideBar']")
    private WebElement brandButton;
    @FindBy(xpath = "//a[@href='/en/car-rentals/filter/brand-audi-63-127']")
    private  WebElement Audi;
    @FindBy(xpath = "//a[text()='BMW ']")
    private WebElement Bmw;
    @FindBy(xpath = "//a[text()='Volkswagen ']")
    private WebElement Volkswagen;
    @FindBy(xpath = "//div[text()=' Transmission ']")
    private WebElement transmissionButton;
    //*[@id="divAtributes"]/div/div[2]/div[1]
    //div[text()=' Transmission ']
    //span[@class='glyphicon glyphicon-chevron-down']
    @FindBy(xpath = "//a[text()='Automatic ']")
    private WebElement transmissionAutomatic;
    //a[@href='/en/car-rentals/filter/transmission-automatic-53-101']
    @FindBy(xpath = "//a[text()='Manual ']")
    private WebElement transmissionManual;
    @FindBy(xpath = "//div[text()=' Number of seats ']")
    private WebElement numberOfSeatsButton;
    @FindBy(xpath = "//a[text()='5 ' and contains(@href,'number-of-seats-5')]")
    private WebElement numberOfSeats5;
    @FindBy(xpath = "//a[text()='4 ' and contains(@href,'number-of-seats-4')]")
    private WebElement numberOfSeats4;
    @FindBy(xpath = "//div[text()=' Number of doors ']")
    private WebElement numberOfDoorsButton;
    @FindBy(xpath = "//a[text()='4 ' and contains(@href,'number-of-doors-4')]")
    private WebElement numberOfDoors4;
    @FindBy(xpath= "//a[text()='5 ' and contains(@href,'number-of-doors-5')]")
    private WebElement numberOfDoors5;
    @FindBy(xpath = "//a[@aria-label='dismiss cookie message']")
    private WebElement buttonAccept;






    public void  clcikAccept(){
        this.elementMethods.clickElement(buttonAccept);
    }
    public void clickOnNumberOfDoors5(){
        this.elementMethods.clickElement(numberOfDoors5);
    }
    public void clickOnNumberOfDoors4(){
        this.elementMethods.clickElement(numberOfDoors4);
    }
    public void clickOnNumberOfDoors(){
        this.elementMethods.clickElement(numberOfDoorsButton);
    }
    public void clickOnNumberOfSeats5(){
        this.elementMethods.clickElement(numberOfSeats5);
    }
    public void clickOnNumberOfSeats4(){
        this.elementMethods.clickElement(numberOfSeats4);
    }
    public void  clickOnNumberOfSeats(){
        this.elementMethods.clickElement(numberOfSeatsButton);
    }
    public  void clickOnManual(){
        this.elementMethods.clickElement(transmissionManual);
    }
    public  void clickOnAutomatic(){
        this.elementMethods.clickElement(transmissionAutomatic);
    }
    public void clickOnTransmission(){
        this.elementMethods.clickElement(transmissionButton);
    }
    public void clickOnBrand(){
        this.elementMethods.clickElement(brandButton);
    }
    public void  clickOnWolkswagen() {
        this.elementMethods.clickElement(Volkswagen);
    }
    public void  clickOnBmw() {
        this.elementMethods.clickElement(Bmw);
    }
    public void  clickOnAudi() {
        this.elementMethods.clickElement(Audi);
    }
    public WebElement getBrandButton() {
        return brandButton;
    }
    public WebElement getTransmissionButton() {
        return transmissionButton;
    }
    public WebElement getNumberOfSeatsButton() {
        return numberOfSeatsButton;
    }
    public WebElement getNumberOfDoorsButton() {
        return numberOfDoorsButton;
    }
}
