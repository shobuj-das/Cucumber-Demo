package StepDefinations;

import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

import static Utilities.DriverSetup.getDriver;

public class MyStepdefs {
    LoginPage loginPage = new LoginPage();
    @Given("User should be on the login page")
    public void userShouldBeOnTheLoginPage() {
        loginPage.nevigateToLoginPage();
    }

    @When("user enter valid username and password")
    public void userEnterValidUsernameAndPassword() throws InterruptedException{
        loginPage.writeOnElement(loginPage.email_field, "shobuj@yopmail.com");
        loginPage.writeOnElement(loginPage.password_field, "shobuj123");
    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        loginPage.clickOnElement(loginPage.login_button);
    }

    @Then("User should be navigated to the homepage")
    public void userShouldBeNavigatedToTheHomepage() {
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://automationexercise.com/");
    }

    @But("User should not be on the login page")
    public void userShouldNotBeOnTheLoginPage() {
        Assert.assertNotEquals(getDriver().getCurrentUrl(), "https://automationexercise.com/login");
    }

    @When("user enter invalid password")
    public void userEnterInvalidPassword() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_field, "green@yopmail.com");
        loginPage.writeOnElement(loginPage.password_field, "testWrong435345345fgsfg");
    }

    @Then("User should not be logged")
    public void userShouldNotBeLoggedin() throws InterruptedException {
        Assert.assertEquals(loginPage.getText(loginPage.errorMgsLocator), "Your email or password is incorrect!");
    }

    @When("User enter {string} on the username field")
    public void userEnterOnTheUsernameField(String arg0) throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_field, arg0);
    }

    @And("User enter {string} on the password filed")
    public void userEnterOnThePasswordFiled(String arg0) throws InterruptedException {
        loginPage.writeOnElement(loginPage.password_field, arg0);
    }

    @Then("User should see {string}")
    public void userShouldSee(String arg0) throws InterruptedException {
        Assert.assertEquals(loginPage.getText(loginPage.errorMgsLocator), arg0);
    }


}
