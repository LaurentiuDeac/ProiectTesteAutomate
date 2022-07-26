package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import propertyFile.PropertyFile;

import java.time.Duration;
import java.util.HashMap;

public class HomeTest {

    private WebDriver driver;

    public HashMap<String, String> testData;

    @Before
    public void setUp(){
        initiateDriver();
    }

    @After
    public void clearEnv(){
        //this.getDriver().quit();
    }

    public void initiateDriver(){
        System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.compexitrentacar.ro/en");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    public WebDriver getDriver(){
        return  this.driver;
    }

    public void populateTestData(){
        String className =  this.getClass().getSimpleName();
        PropertyFile propertyFile = new PropertyFile(className);
        testData = propertyFile.getAllValues();
    }




}
