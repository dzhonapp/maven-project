package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ResourceBundle;

public class BaseTest {

    WebDriver driver;
    ResourceBundle rb;

    @BeforeMethod
    public void setup(String browser) {
        rb = ResourceBundle.getBundle("config.properties");

        driver = new FirefoxDriver();
        driver.get(rb.getString("app_url"));
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void terminate() {
        driver.close();
    }

}
