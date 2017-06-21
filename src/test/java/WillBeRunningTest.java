/**
 * Created by Elkanag on 6/13/2017.
 */

import Connections.SQLconn;
import PageObjects.Documentation;
import PageObjects.LoginAdministratorBeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.DriverManager;


public class WillBeRunningTest {

    WebDriver driver = null;
    LoginAdministratorBeforeTest loginAdministratorBeforeTest = null;

    //what need to do before this class will be run >> different inputs for test cases
    @BeforeClass
     public void BeforeClass(){
        driver = Documentation.openChrome();
        loginAdministratorBeforeTest = new LoginAdministratorBeforeTest(driver);

    }

//all the dependents that we need before the test >> start the web

    @BeforeMethod
    public void setupBeforeEachFunction() {
        // reopen the login page
        Reporter.log("Open Main page");
        Documentation.OpenMainPage(driver);
        loginAdministratorBeforeTest.typeUsername();
        loginAdministratorBeforeTest.typePassword();
        loginAdministratorBeforeTest.clickButton();
    }

//we have to close the browser
    @AfterClass
    public void finalTearDown() {
    Reporter.log("Closing the browser");
    Documentation.closeBrowser(driver);
}

//the test!!!!!
    @Test
    public void myTest(){}








}
