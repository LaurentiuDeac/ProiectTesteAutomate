package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest extends HomeTest  {

    public RegisterTest(){
    }

    @Test
    public void RegisterWithSuccess(){
        populateTestData();
        HomePage homePage= new HomePage(this.getDriver());
        homePage.hoverOnUser();
        homePage.clickOnRegister();

        LoginPage loginPage = new LoginPage(this.getDriver());
        loginPage.fillEmailAndContinue(testData);

        RegisterPage registerPage = new RegisterPage(this.getDriver());
        registerPage.createAccount(testData);

    }

}
