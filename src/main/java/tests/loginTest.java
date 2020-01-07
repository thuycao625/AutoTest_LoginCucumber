package tests;

import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import MyRunner.*;
import org.openqa.selenium.support.PageFactory;


public class loginTest extends TestRunner {


    private static LoginPage loginPage;

    @Given("Open website (.*)$")
    public void user_already_on_home_page(String website) {
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();

    }

    @When("^I input username as (.*) and password as (.*)$")
    public void inputUser (String username, String password) {
        getLoginPage().userAccount(username,password);

    }

    @Then("^I click submit$")
    public void submitLogin() {
        getLoginPage().clickSubmit();
    }

    @Then("^I verify system navigates to the dashboard page")
    public void add_new_item() {

    }

    public static LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = PageFactory.initElements(TestRunner.driver, LoginPage.class);
        }
        return loginPage;
    }


}
