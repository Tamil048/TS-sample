package Stepdefinition;

import PageObject.FlipKartLogin;
import Webutil.BrowserFactory;
import Webutil.PropertyReader;
import Webutil.WebUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class FlipKartPersonalDetails {
    public static WebDriver driver;

    PropertyReader property = new PropertyReader();
    @Given("^user is already on flipkart page$")
    public void user_is_already_on_flipkart_page() throws Throwable
    {
        BrowserFactory.browserCall();
        FlipKartLogin.driver =  BrowserFactory.getDriver();
        FlipKartLogin.getURL();

    }

    @When("^title of login page is online shopping$")
    public void title_of_login_page_is_online_shopping() throws Throwable
    {
       // Assert.assertEquals("Online Shopping Sites for Mobiles,Fashion,Books,Electronics,Home Appliances and More",FlipKartLogin.verifyTitle());
        FlipKartLogin.verifyTitle();
    }

    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        FlipKartLogin.userNameAndPassword(username,password);
    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable
    {
        FlipKartLogin.clickLoginButton();
    }

    @When("^navigate to My Account tab and click on \"([^\"]*)\" tab$")
    public void navigateToMyAccountTabAndClickOnTab(String profile) throws Throwable {
        FlipKartLogin.selectDropDown(profile);
    }

    @When("^Edit the personal information field as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void edit_the_personal_information_field_as_and(String fname, String lname) throws Throwable {
        FlipKartLogin.firstNameAndLastName(fname,lname);
    }

    @When("^select the \"([^\"]*)\"$")
    public void select_the(String gender) throws Throwable {
        FlipKartLogin.selectGender(gender);
    }

    @When("^user enters the \"([^\"]*)\"$")
    public void user_enters_the(String arg1) throws Throwable {

    }
    @Then("^user click on \"([^\"]*)\" button$")
    public void userClickOnButton(String logout) throws Throwable {
        FlipKartLogin.selectDropDown(logout);
    }
}
