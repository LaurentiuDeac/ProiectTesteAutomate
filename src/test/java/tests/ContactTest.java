package tests;

import org.junit.Test;
import pages.ContactPage;
import pages.HomePage;

public class ContactTest extends HomeTest {

    @Test
    public void ContactTest() {

        populateTestData();
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnContact();
        ContactPage contactPage = new ContactPage(this.getDriver());
        contactPage.sendContactMessage(testData);
    }

    @Test
    public void AboutUs(){
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnContact();
        ContactPage contactPage = new ContactPage(this.getDriver());
        contactPage.clickAboutUs();
    }
    @Test
    public void Gdpr(){
        HomePage homePage = new HomePage(this.getDriver());
        homePage.clickOnContact();
        ContactPage contactPage = new ContactPage(this.getDriver());
        contactPage.clickgdpr();
    }
}




////nav[@id='navigation']/ul/li/a[@href='/en/contact-en'] pentru contacte
