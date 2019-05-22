package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\drivers\\latestchrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.freecrm.com/");
        driver.findElement(By.name("username")).sendKeys("naveenk");
        driver.findElement(By.name("password")).sendKeys("test@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.switchTo().frame("mainpanel");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'abc abc')]/parent::td//preceding_sibling::td//input[@name='contact_id']")).click();

    }
}
