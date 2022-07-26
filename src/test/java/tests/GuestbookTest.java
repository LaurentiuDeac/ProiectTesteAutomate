package tests;

import org.junit.Test;
import pages.GuestbookPage;
import pages.HomePage;

public class GuestbookTest extends HomeTest {

    @Test
    public void GuestbookTest() {

        populateTestData();
        HomePage homePage= new HomePage(this.getDriver());
        homePage.clickOnGuestbook();
        GuestbookPage guestbook = new GuestbookPage(this.getDriver());
        guestbook.sendMessage(testData);


    }

    @Test
    public void checkboxTest(){
        HomePage homePage= new HomePage(this.getDriver());
        homePage.clickOnGuestbook();
        GuestbookPage guestbook = new GuestbookPage(this.getDriver());
        guestbook.clickCheckBox();

    }






}
