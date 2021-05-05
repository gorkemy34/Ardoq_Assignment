package stepdefinitions;

import ardoq.pages.Sauced;
import ardoq.utilities.ConfigReader;
import ardoq.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class TestCase extends TestBase {


    @Test

    public void loginDevPorTest() throws InterruptedException {

        driver.get("https://www.saucedemo.com/");
        Sauced sauced = new Sauced(driver);
        sauced.userNameBox.sendKeys(ConfigReader.getProperty("Username"));
        sauced.passwordBox.sendKeys(ConfigReader.getProperty("Password"));
        sauced.loginButton.click();
        sauced.filterDropdown.click();
        Select options = new Select(sauced.filterDropdown);
        options.selectByValue("hilo");



        }

    }

