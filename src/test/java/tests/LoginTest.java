package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends HomeTest {

    @Test
    public void LoginWithSuccess(){
        populateTestData();
        HomePage homePage= new HomePage(this.getDriver());
        homePage.hoverOnUser();
        homePage.clickOnLogin();

        LoginPage loginPage = new LoginPage(this.getDriver());
        loginPage.login(testData);
    }

    @Test
    public void LoginWithoutSuccessWrongPass(){
        populateTestData();
        HomePage homePage= new HomePage(this.getDriver());
        homePage.hoverOnUser();
        homePage.clickOnLogin();

        LoginPage loginPage = new LoginPage(this.getDriver());
        loginPage.loginWithWrongPassword(testData);
    }

    @Test
    public void LoginWithoutSuccessWrongEmail(){
        populateTestData();
        HomePage homePage= new HomePage(this.getDriver());
        homePage.hoverOnUser();
        homePage.clickOnLogin();

        LoginPage loginPage = new LoginPage(this.getDriver());
        loginPage.loginWithWrongEmail(testData);
    }


}
