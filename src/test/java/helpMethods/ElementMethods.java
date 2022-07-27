package helpMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementMethods {

    public WebDriver driver;

    public ElementMethods(WebDriver driver){
        this.driver=driver;
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void fillElement(WebElement element, String value){
        element.sendKeys(value);
    }
    public void hoverElement(WebElement element){
        Actions action = new Actions(this.driver);
        action.moveToElement(element).build().perform();
    }

    public void scrollIntoViewElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void clickJsElement(WebElement element){
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].click();", element);
    }

}
