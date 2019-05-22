package Webutil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {

        public static WebDriver driver;
        public  static PropertyReader property = new PropertyReader();
        public BrowserFactory()
        {
            browserCall();
        }
        public static void browserCall(){
            String browser = property.getProperty("Browser");
            if(browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "F:\\selenium jars\\Selelnium Driver\\latestchrome\\chromedriver.exe");
                 driver =new ChromeDriver();
                 driver.manage().window().maximize();
            }
            else if (browser.equalsIgnoreCase("Firefox")){
                System.setProperty("webdriver.gecko.driver", "F:\\selenium jars\\Selelnium Driver\\Firefox\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
            else if (browser.equalsIgnoreCase("IE")){
                System.setProperty("webdriver.ie.driver", "F:\\selenium jars\\Selelnium Driver\\IE driver\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }
        }
        public static WebDriver getDriver()
        {
            return driver;
        }
//        public static WebDriver createChromeDriver(){
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("disable-infobars");
//            if(System.getProperty("os.name").contains("windows"))
//            {
//                System.setProperty("webdriver.chrome.driver", "F:\\selenium jars\\Selelnium Driver\\latestchrome\\chromedriver.exe");
//            }
//            else
//            {
//                System.setProperty("webdriver.chrome.driver", "F:\\selenium jars\\Selelnium Driver\\latestchrome");
//            }
//            return createChromeDriver();
//        }
//        public static WebDriver createFirefoxDriver(){
//            DesiredCapabilities cap= new DesiredCapabilities();
//            cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
//            cap.setCapability("platform","Windows");
//            return new FirefoxDriver(cap);
//        }


    }
