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
        guestbook.clickCheckBox();
        guestbook.clickAccept();
    }

    @Test
    public void GuestbookTest() throws InterruptedException {
        populateTestData();
        HomePage homePage= new HomePage(this.getDriver());
        homePage.clickOnGuestbook();
        GuestbookPage guestbook = new GuestbookPage(this.getDriver());
        guestbook.sendMessage(testData);
    }


    @Test
    public void writeMessageWithoutName() throws InterruptedException {
        populateTestData();
        HomePage homePage= new HomePage(this.getDriver());
        homePage.clickOnGuestbook();
        GuestbookPage guestbook = new GuestbookPage(this.getDriver());
        guestbook.writeCommentWithoutName(testData);
    }

    @Test
    public void writeMessageWithoutMessage() throws InterruptedException {
        populateTestData();
        HomePage homePage= new HomePage(this.getDriver());
        homePage.clickOnGuestbook();
        GuestbookPage guestbook = new GuestbookPage(this.getDriver());
        guestbook.writeCommentWithoutMessage(testData);
    }

}
