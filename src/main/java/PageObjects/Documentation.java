/**
 * Created by Elkanag on 6/13/2017.
 */

package PageObjects;

//The code in the class will tell us:
//1. web driver
//2. what web diver
//3. Open URL (and main screen)
//4. Close main driver


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Documentation {


    static String ChooseWebDriver = "webdriver.chrome.driver";
    static String driverPath="C:\\Users\\doronb\\IdeaProjects\\PnmsoftProjetcs\\src\\main\\resources\\chromedriver.exe";
    static String MainURL = "http://admin.pnmsoftlabs.com/Main.aspx";

    public static WebDriver openChrome() {
        System.setProperty(ChooseWebDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        // bring the new browser to focus
        ((JavascriptExecutor)driver).executeScript("alert('Test')");
        driver.switchTo().alert().accept();
        driver.manage().window().maximize();

        return driver;
    }

    public static void OpenMainPage(WebDriver driver) {
        // navigate to the practis fake log-in page website
        driver.get(MainURL);
    }

    public static void closeBrowser(WebDriver driver) {
        driver.close(); // Close the browser
    }

}

