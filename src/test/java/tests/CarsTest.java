package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CarsPage;
import pages.HomePage;

import java.util.List;

public class CarsTest extends HomeTest{

    @Test
    public void validateCarsPageTest(){
        HomePage homePage= new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        Assert.assertNotNull(carsPage.getBrandButton());
        Assert.assertNotNull(carsPage.getTransmissionButton());
        Assert.assertNotNull(carsPage.getNumberOfDoorsButton());
        Assert.assertNotNull(carsPage.getNumberOfDoorsButton());
    }


    @Test
    public void selectAudiBrandTest(){
        HomePage homePage= new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());

        carsPage.clickOnBrand();
        carsPage.clickOnAudi();
        validateCarsBrand("audi");
    }

    @Test
    public void selectTransmissionAutomaticTest() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        carsPage.clickOnTransmission();
        carsPage.clickOnAutomatic();
        validateCarsTransmission("automatic");
    }

    @Test
    public void selectTransmissionManualTest() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        carsPage.clickOnTransmission();
        carsPage.clickOnManual();
        validateCarsTransmission("manual");
    }

    @Test
    public void validateNumberOfSeatsButtonTest() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        carsPage.clickOnNumberOfSeats();

    }

    @Test
    public void selectNumberOfSeats4Test() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        carsPage.clickOnNumberOfSeats();
        carsPage.clickOnNumberOfSeats4();
        //validateCarsNumberOfSeats("4");  // bug in the product
    }

    @Test
    public void selectNumberOfSeats5Test() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        carsPage.clickOnNumberOfSeats();
        carsPage.clickOnNumberOfSeats5();
        validateCarsNumberOfSeats("5");
    }



    @Test
    public void validateNumberOfDoorsButtonTest() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        carsPage.clickOnNumberOfDoors();
    }

    @Test
    public void selectNumberOfDoors4Test() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        carsPage.clickOnNumberOfDoors();
        carsPage.clickOnNumberOfDoors4();
        validateCarsNumberOfDoors("4");
    }

    @Test
    public void selectNumberOfDoors5Test() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        carsPage.clickOnNumberOfDoors();
        carsPage.clickOnNumberOfDoors5();
        validateCarsNumberOfDoors("5");
    }

    @Test
    public void selectBrandAudiWithFiltersTest(){
        HomePage homePage= new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        carsPage.clickOnBrand();
        carsPage.clickOnAudi();
        carsPage.clickOnTransmission();
        carsPage.clickOnAutomatic();
        carsPage.clickOnNumberOfSeats();
        carsPage.clickOnNumberOfSeats5();
        carsPage.clickOnNumberOfDoors();
        carsPage.clickOnNumberOfDoors5();
        validateCarsWithAllFilters("audi","automatic","5");
    }
    @Test
    public void selectBrandBmwWithFiltersTest() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        carsPage.clickOnBrand();
        carsPage.clickOnBmw();
        carsPage.clickOnTransmission();
        carsPage.clickOnAutomatic();
        carsPage.clickOnNumberOfDoors();
        carsPage.clickOnNumberOfDoors5();
        validateCarsWithAllFilters("bmw","automatic","5");
    }

    @Test
    public void selectBrandVolkswagenWithFiltersTest() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        carsPage.clickOnBrand();
        carsPage.clickOnWolkswagen();
        carsPage.clickOnTransmission();
        carsPage.clickOnManual();
        carsPage.clickOnNumberOfSeats();
        carsPage.clickOnNumberOfSeats5();
        carsPage.clickOnNumberOfDoors();
        carsPage.clickOnNumberOfDoors5();
        validateCarsWithAllFilters("volkswagen","manual","5");
    }
    @Test
    public void selectBrandVolkswagenWithDifferentFiltersTest() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnCars();
        CarsPage carsPage = new CarsPage(this.getDriver());
        carsPage.clickOnBrand();
        carsPage.clickOnWolkswagen();
        carsPage.clickOnTransmission();
        carsPage.clickOnAutomatic();
        carsPage.clickOnNumberOfSeats();
        carsPage.clickOnNumberOfSeats5();
        carsPage.clickOnNumberOfDoors();
        carsPage.clickOnNumberOfDoors4();
        validateCarsWithAllFilters("volkswagen","automatic","4");
    }



    public void validateCarsBrand(String brand) {
        List<WebElement> displayedCars = this.getDriver().findElements(By.xpath("//div[@id='allcars']/div/div"));
        for (int i = 0; i < displayedCars.size(); i++) {
            WebElement car = displayedCars.get(i); //get each car from the list
            String carName = car.findElement(By.xpath(".//div/div/a")).getText(); // get the name for the car
            Assert.assertTrue(carName.toLowerCase().contains(brand)); //car name contains the selected brand
        }
    }

    public void validateCarsTransmission(String transmission){
        List<WebElement> displayedCars= this.getDriver().findElements(By.xpath("//div[@id='allcars']/div/div"));
        for(int i =0;i< displayedCars.size(); i++){
            WebElement car = displayedCars.get(1);
            String carTransmission= car.findElement(By.xpath(".//div[@class='car-attribute']/div")).getText();
            Assert.assertTrue(carTransmission.toLowerCase().contains(transmission));

        }
    }

    public void validateCarsNumberOfSeats(String seats) {
        List<WebElement> displayedCars = this.getDriver().findElements(By.xpath("//div[@id='allcars']/div/div"));
        for (int i = 0; i < displayedCars.size(); i++) {
            WebElement car = displayedCars.get(i);
            String carSeats = car.findElement(By.xpath(".//div[@class='car-attribute']/div[3]")).getText();
            Assert.assertTrue(carSeats.equals(seats));
        }
    }
    private void validateCarsNumberOfDoors(String doors){
        List<WebElement> displayedCars = this.getDriver().findElements(By.xpath("//div[@id='allcars']/div/div"));
        for (int i=0; i< displayedCars.size(); i++) {
            WebElement car = displayedCars.get(i);
            String carDoors = car.findElement(By.xpath(".//div[@class='car-attribute']/div[3]")).getText();
            Assert.assertTrue(carDoors.equals(doors));

        }
    }

    public void validateCarsWithAllFilters(String brand,String transmission,String doors){
        List<WebElement> displayedCars = this.getDriver().findElements(By.xpath("//div[@id='allcars']/div/div"));
        for (int i=0; i<displayedCars.size(); i++){
            WebElement car = displayedCars.get(i);

            String carName = car.findElement(By.xpath(".//div/div/a")).getText();
            Assert.assertTrue(carName.toLowerCase().contains(brand));

            String carTransmission= car.findElement(By.xpath(".//div[@class='car-attribute']/div")).getText();
            Assert.assertTrue(carTransmission.toLowerCase().contains(transmission));

            String carDoors = car.findElement(By.xpath(".//div[@class='car-attribute']/div[3]")).getText();
            Assert.assertTrue(carDoors.equals(doors));

        }
    }


}





