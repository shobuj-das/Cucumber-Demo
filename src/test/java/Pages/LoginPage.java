package Pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    HomePage homePage = new HomePage();

// all locators of LoginPage
    public By email_field = By.xpath("//input[@data-qa='login-email']");
    public By password_field = By.xpath("//input[@placeholder='Password']");
    public By login_button = By.xpath("//button[normalize-space()='Login']");
    public By errorMgsLocator = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");

    public void nevigateToLoginPage(){
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.login_signup_button);
    }
}
