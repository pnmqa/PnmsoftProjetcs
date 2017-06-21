/**
 * Created by Elkanag on 6/13/2017.
 */

package PageObjects;


//The code in the class will tell us:
//only login to main page (flowtime/administrator)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginAdministratorBeforeTest {

    WebDriver driver;
    static String UserNameValue = "administrator";
    static String PasswordValue = "e";
    //int PasswordValue = 1;


    public LoginAdministratorBeforeTest(WebDriver driver) {
        this.driver = driver;
    }

    public By UserNameField = By.id("userName");
    public By PasswordField = By.id("password");
    public By LoginButton = By.id("SignInButton");

   // public void typeUsername(String UserNameValue) {
       //WebElement usernameField = driver.findElement(UserNameField);
       // usernameField.clear();
        //usernameField.sendKeys(UserNameValue);
    //}

    public void typeUsername() {
        WebElement usernameField = driver.findElement(UserNameField);
        usernameField.clear();
        usernameField.sendKeys(UserNameValue);
    }


    public void typePassword() {
        WebElement passwordField = driver.findElement(PasswordField);
        passwordField.clear();
        passwordField.sendKeys(PasswordValue);
    }

    //Click on login
    public void clickButton() {
        driver.findElement(LoginButton).click();
    }
}
