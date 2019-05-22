package Stepdefinition;

import PageObject.FilterSelectForMobiles;
import PageObject.FlipKartLogin;
import Webutil.BrowserFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;


public class MobileSearch {
    public static WebDriver driver;
    @When("^search \"([^\"]*)\" in search text box$")
    public void search_in_search_text_box(String productname) throws Throwable {
        FilterSelectForMobiles.searchMobile(productname);
    }

    @Then("^select mobile price as \"([^\"]*)\" and max as \"([^\"]*)\"$")
    public void select_mobile_price_as_and_max_as(String minimum, String maximum) throws Throwable {
        FilterSelectForMobiles.selectPrice(minimum,maximum);
    }
    @Then("^select the RAM as \"([^\"]*)\"$")
    public void selectTheRAMAs(String chooseRAM) throws Throwable {
        FilterSelectForMobiles.selectRAM(chooseRAM);
    }

    @When("^select brand as \"([^\"]*)\"$")
    public void selectBrandAs(String selectBrand) throws Throwable {
        FilterSelectForMobiles.selectBrand(selectBrand);
    }
    @Then("^customer ratings is \"([^\"]*)\" is \"([^\"]*)\"$")
    public void customerRatingsIsIs(String customerRatings, String stars) throws Throwable {
        FilterSelectForMobiles.customerRatings(customerRatings,stars);
    }
    @And("^select mobile as \"([^\"]*)\"$")
    public void selectMobileAs(String productName) throws Throwable {
        FilterSelectForMobiles.selectMobile(productName);
        }


    @Then("^Navigate to child window and change the \"([^\"]*)\"$")
    public void navigateToChildWindowAndChangeThe(String pincode) throws Throwable {

    }

    @Then("^Add to cart$")
    public void addToCart() throws Throwable {
    FilterSelectForMobiles.compare();
    }
}
