package PageObject;

import Webutil.PropertyReader;
import Webutil.WebUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class FlipKartLogin {
    public static WebDriver driver;
    public static PropertyReader prop=new PropertyReader();
    public static void getURL() throws InterruptedException
    {
        driver.get(prop.getProperty("Url"));
    }
    public static void userNameAndPassword(String user,String pwd)
    {
        WebUtil.textBox(driver,By.xpath("//input[@class='_2zrpKA']"),user);
        //driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys(user);
        //driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys(pwd);
        WebUtil.textBox(driver,By.xpath("//input[@class='_2zrpKA _3v41xv']"),pwd);
    }
    public static WebDriver clickLoginButton()
    {
        driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
        return driver;
    }
    public static void verifyTitle()
    {
        System.out.println(driver.getTitle());
    }
    public static void selectDropDown(String dropdownmenu){
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='container']//header//div[@class='AsXM8z']//div[@class='_1Wr4v5']//div[@class='row']")));
        WebElement mainMenu = driver.findElement(By.xpath("//div[@id='container']//header//div[@class='AsXM8z']//div[@class='_1Wr4v5']//div[@class='row']"));
        actions.moveToElement(mainMenu).build().perform();
        List<WebElement> list=driver.findElements(By.xpath("//div[@class='nMZVnr']/ul[@class='_3Ji-EC']//li"));
        int count=10;
        while(count>1)
            try {
                if (!list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        String profile=list.get(i).getText();
                        if (profile.equalsIgnoreCase(dropdownmenu)) {
                            list.get(i).click();
                            break;
                        }
                    }
                }
            }
            catch (Exception e)
            {
                count--;
            }
    }
    public static void firstNameAndLastName(String first,String last){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement clickPesonalInformation = driver.findElement(By.cssSelector("._2aK_Hc"));
        WebElement clickOnEdit = clickPesonalInformation.findElement(By.cssSelector("._1x4IU1"));
        clickOnEdit.click();
        WebElement userName = driver.findElement(By.xpath("//div[@class='Th26Zc']//input[@name='firstName']"));
        userName.clear();
        userName.sendKeys(first);
        WebElement lastName = driver.findElement(By.xpath("//div[@class='Th26Zc']//input[@name='lastName']"));
        lastName.clear();
        lastName.sendKeys(last);
    }
    public static void selectGender(String sex){
        List<WebElement> selectGender = driver.findElements(By.xpath("//div[@class='_1JMKW3']/div[@class='l022CW']//form//div[3]/label"));
        for (int k=0;k<selectGender.size();k++){
            WebElement local_radio=selectGender.get(k);
            String value = local_radio.getAttribute("for");
            System.out.println(value);
            if(value.equalsIgnoreCase(sex)){
                local_radio.click();
                break;
            }
        }
        driver.findElement(By.xpath("//button[contains(text(),'SAVE')]")).click();
    }
    public static void enterEmailId(){
        WebDriverWait wait1 = new WebDriverWait(driver,50);
        wait1.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[@class='oZoRPi']//preceding::a[1]"))));
        driver.findElement(By.xpath("//a[@class='oZoRPi']//preceding::a[1]")).click();
        WebElement enterEmail=driver.findElement(By.xpath("//div[@class='Th26Zc']//input[@name='email']"));
        enterEmail.clear();
        enterEmail.sendKeys("tamilselvan.ark@gmail.com");
        driver.findElement(By.cssSelector("._2AkmmA.Ezn5Io._3HuCeA")).click();
    }
    public static void changePassword(){
        driver.findElement(By.xpath("//div[@class='_3oYEid']//a[contains(text(),'Change Password')]")).click();
        driver.findElement(By.xpath("//form//div[@class='_2Jv7Ba']/div[@class='Th26Zc']/input[@name='oldPassword']")).sendKeys("Tamil048");
        driver.findElement(By.xpath("//form//div[@class='Th26Zc']//input[@name='newPassword']")).sendKeys("Tamil048");
        driver.findElement(By.xpath("//form//div[@class='Th26Zc']//input[@name='retypePassword']")).sendKeys("Tamil048");
        driver.findElement(By.xpath("//form//button[contains(text(),'Change Password')]")).click();
    }
    public static void searchProduct(){
        WebElement searchText = driver.findElement(By.cssSelector(".LM6RPg"));
        searchText.sendKeys("Mobile phone");
        searchText.sendKeys(Keys.ENTER);
        WebElement selectStartPrice= driver.findElement(By.xpath("//section[@class='_1MCcAi D_NGuZ']//div[@class='_3Uy12X']//div[@class='_1qKb_B']//select"));
    }
}
