package Webutil;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtil {
    public static int TIMEOUT=50;
    public static void textBox(WebDriver driver,By by,String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    public static void waitForElementVisible(WebDriver driver,By by){
        WebDriverWait wait = new WebDriverWait(driver,TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void elementToBeClickable(WebDriver driver,By by){
        WebDriverWait wait = new WebDriverWait(driver,TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

}
