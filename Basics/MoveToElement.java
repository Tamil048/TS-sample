package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MoveToElement {

   // static public WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\selenium jars\\Selelnium Driver\\LatestChrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com");
//        driver.manage().window().maximize();
//        driver.get("https://spicejet.com/");
//        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
//        Thread.sleep(1000);
//        List<WebElement> list=driver.findElements(By.xpath("//div[@id='smoothmenu1']//ul//li[@class='li-login float-right']/ul/li"));
//        for (int i=0;i<list.size();i++){
//            String Profile=list.get(i).getText();
//            if(Profile.equalsIgnoreCase("SpiceClub Members")){
//                List<WebElement> list1 = driver.findElements(By.xpath("//div[@id='smoothmenu1']//ul//li[@class='li-login float-right']/ul//li[2]//ul"));
//                for (int j=0;j<list1.size();j++){
//                    String profile1=list1.get(j).getText();
//                    if(profile1.equalsIgnoreCase("Member Login")){
//                        list1.get(j).click();
//                    }
//                }
//            }
//        }
//
//        driver.quit();
//
//    }
    }
}
