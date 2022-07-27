package tests;

import org.junit.Test;
import pages.GuestbookPage;
import pages.HomePage;

public class GuestbookTest extends HomeTest {


    @Test
    public void checkboxTest(){
        HomePage homePage= new HomePage(this.getDriver());
        homePage.clickOnGuestbook();
        GuestbookPage guestbook = new GuestbookPage(this.getDriver());
        guestbook.clickAccept();
        guestbook.clickCheckBox();
    }

    @Test
    public void GuestbookTest() {

        populateTestData();
        HomePage homePage= new HomePage(this.getDriver());
        homePage.clickOnGuestbook();
        GuestbookPage guestbook = new GuestbookPage(this.getDriver());
        guestbook.sendMessage(testData);
        guestbook.clickAccept();
    }


    @Test
    public void writeMessageWithoutName(){
        populateTestData();
        HomePage homePage= new HomePage(this.getDriver());
        homePage.clickOnGuestbook();
        GuestbookPage guestbook = new GuestbookPage(this.getDriver());
        guestbook.writeCommentWithoutName(testData);
    }

    @Test
    public void writeMessageWithoutMessage(){
        populateTestData();
        HomePage homePage= new HomePage(this.getDriver());
        homePage.clickOnGuestbook();
        GuestbookPage guestbook = new GuestbookPage(this.getDriver());
        guestbook.writeCommentWithoutMessage(testData);
    }




}
