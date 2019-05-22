package PageObject;

import Webutil.BrowserFactory;
import Webutil.WebUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FilterSelectForMobiles {
        public static WebDriver driver;
        static  {
            driver= BrowserFactory.getDriver();
        }
        public static void searchMobile(String mobile)
        {
            int count=10;
            while(count>1) {
                try
                {
                    WebUtil.waitForElementVisible(driver,By.xpath("//div[@class= 'row _3XGGG6']//div[@class='row']//div[@class='O8ZS_U']//input[@class='LM6RPg']"));
                    WebElement enterttext = driver.findElement(By.xpath("//div[@class= 'row _3XGGG6']//div[@class='row']//div[@class='O8ZS_U']//input[@class='LM6RPg']"));
                    enterttext.sendKeys(mobile);
                    enterttext.sendKeys(Keys.ENTER);
                    break;
                }
                catch (Exception e){
                    count--;
                }
            }
        }
        public static void selectPrice(String min,String max)
        {
            WebUtil.elementToBeClickable(driver,By.xpath("//div[@id='container']//div[@class='t-0M7P _2doH3V']"));
            WebElement selectstartprice = driver.findElement(By.xpath("//section[@class='_1MCcAi D_NGuZ']//*[@class='_3Uy12X']//div[@class='_1qKb_B']//select[@class='fPjUPw']"));
            Select select = new Select(selectstartprice);
            select.selectByValue(min);
            WebElement maximumprice = driver.findElement(By.xpath("//section[@class='_1MCcAi D_NGuZ']//*[@class='_3Uy12X']//div[@class='_1YoBfV']//select[@class='fPjUPw']"));
            Select selectprice = new Select(maximumprice);
            selectprice.selectByValue(max);

        }
        public static void selectRAM(String selectbrand){

            boolean isDisplayedRAM = driver.findElement(By.xpath("//div[@class='_1HmYoV hCUpcT']//*[@class='bhgxx2 col-12-12']//div[contains(text(),'RAM')]")).isDisplayed();
            if(isDisplayedRAM == true)
            {
                List<WebElement> select=driver.findElements(By.xpath("//div[@class='_1YuAuf']//section[@class='_1gjf4c D_NGuZ']//div[@class='_3mk-PQ']//div[@class='_36jUgy']//div[@class='_2wQvxh _1WV8jE']//label"));
                for(int i=0;i<select.size();i++)
                {
                    String selectcheckbox = select.get(i).getText();
                    if(selectcheckbox.equalsIgnoreCase(selectbrand))
                    {
                        select.get(i).click();
                        break;
                    }
                }
            }
        }


        public static void selectBrand(String chooseOptions){
            boolean isDisplayedBrand =driver.findElement(By.xpath("//div[@class='_1HmYoV hCUpcT']//*[@class='bhgxx2 col-12-12']//div[contains(text(),'Brand')]")).isDisplayed();
            if (isDisplayedBrand == true ){
                WebElement selectbrand = driver.findElement(By.xpath("//section[@class='_1gjf4c D_NGuZ']//div[@class='_3mk-PQ']//div[@class='_36jUgy']//div[@class='-FTLnR']//input[@class='_3vKPvR']"));
                selectbrand.sendKeys(chooseOptions);
                boolean isEnabledCompanyName = selectbrand.isEnabled();
                if (isEnabledCompanyName == true) {
                    List<WebElement> select = driver.findElements(By.xpath("//section[@class='_1gjf4c D_NGuZ']//div[@class='_3mk-PQ']//div[@class='_36jUgy']//div[@class='_4IiNRh _2mtkou']"));
                    for (int i = 0; i < select.size(); i++) {
                        String selectcheckbox = select.get(i).getText();
                        if (selectcheckbox.equalsIgnoreCase(chooseOptions)) {
                            select.get(i).click();
                            break;
                        }
                    }
                }

            }
        }


        public static void customerRatings(String customer,String chooseRatings){
            boolean isDisplayedBrand =driver.findElement(By.xpath("//div[@class='_1HmYoV hCUpcT']//*[@class='bhgxx2 col-12-12']//div[contains(text(),'"+customer+"')]")).isDisplayed();
            if (isDisplayedBrand == true){
//                WebElement selectbrand = driver.findElement(By.xpath("//section[@class='_1gjf4c D_NGuZ']//div[@class='_3mk-PQ']//div[@class='_36jUgy']//div[@class='-FTLnR']//input[@class='_3vKPvR']"));
//                selectbrand.sendKeys(chooseRatings);
                List<WebElement> select=driver.findElements(By.xpath("//section[@class='_1gjf4c D_NGuZ']//div[@class='_3mk-PQ']//div[@class='_36jUgy']//div[@class='_4IiNRh _2mtkou']"));
                for(int i=0;i<select.size();i++)
                {
                    String selectcheckbox = select.get(i).getText();
                    if(selectcheckbox.equalsIgnoreCase(chooseRatings))
                    {
                        select.get(i).click();
                        break;
                    }
                }

            }

        }

        public  static void selectMobile(String brand){
            List<WebElement> selectMobileBrand = driver.findElements(By.xpath("//div[@class='_3e7xtJ']//div[@class='_1HmYoV hCUpcT']//div[@class='_1HmYoV _35HD7C col-10-12']/div[@class='bhgxx2 col-12-12']"));
            for (int i=0;i<selectMobileBrand.size();i++){
                String mobileBrand=selectMobileBrand.get(i).getText();
                if(mobileBrand.contains(brand)){
                    selectMobileBrand.get(i).click();
                    break;
                }
            }
        }
        public static void compare(){
            String myWindowHandle = driver.getWindowHandle();
            Set<String> handles = driver.getWindowHandles();
            Iterator<String> it = handles.iterator();
            String parentid = it.next();
            String childid=it.next();
            driver.switchTo().window(childid);
            WebUtil.waitForElementVisible(driver, By.xpath("//div[@id='container']//div[@class='Y5-ZPI']"));
            boolean isSelectedCompareCheckBox = driver.findElement(By.cssSelector("._1O_CiZ")).isSelected();
            if (!isSelectedCompareCheckBox == true) {
                    driver.findElement(By.cssSelector("._1O_CiZ")).click();
            }

            FilterSelectForMobiles.verifyPinCode();
        }



        public static void verifyPinCode(){
            driver.findElement(By.cssSelector("#pincodeInputId")).sendKeys("600100");
        }

}
