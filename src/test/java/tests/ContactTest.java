package tests;

import org.junit.Test;
import pages.ContactConfirmationPage;
import pages.ContactPage;
import pages.HomePage;

public class ContactTest extends HomeTest {

    @Test
    public void ContactTest() throws InterruptedException {

        populateTestData();
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnContact();
        ContactPage contactPage = new ContactPage(this.getDriver());
        contactPage.sendContactMessage(testData);
        ContactConfirmationPage contactConfirmationPage = new ContactConfirmationPage(this.getDriver());
        contactConfirmationPage.validateMessage();
    }

    @Test
    public void sendMessageWithoutName() throws InterruptedException {
        populateTestData();
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnContact();
        ContactPage contactPage = new ContactPage(this.getDriver());
        contactPage.sendContactMessageWithoutName(testData);
    }
    @Test
    public void sendMessageWithoutPhone() throws InterruptedException {

        populateTestData();
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnContact();
        ContactPage contactPage = new ContactPage(this.getDriver());
        contactPage.sendContactMessageWithoutPhone(testData);
    }
    @Test
    public void sendMessageWithoutEmail() throws InterruptedException {

        populateTestData();
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnContact();
        ContactPage contactPage = new ContactPage(this.getDriver());
        contactPage.sendContactMessageWithoutEmail(testData);
    }
    @Test
    public void sendMessageWithoutMessage() throws InterruptedException {

        populateTestData();
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnContact();
        ContactPage contactPage = new ContactPage(this.getDriver());
        contactPage.sendContactMessageWithoutMessage(testData);
    }

    @Test
    public void AboutUs(){
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnContact();
        ContactPage contactPage = new ContactPage(this.getDriver());
        contactPage.clickAccept();
        contactPage.clickAboutUs();
        contactPage.closeWindow();
    }
    @Test
    public void Gdpr(){
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnContact();
        ContactPage contactPage = new ContactPage(this.getDriver());
        contactPage.clickgdpr();
        contactPage.closeWindow();
    }

}





