package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class ConnectionDriver {

    public WebDriver driver;

//    We should initialize page objects using initElements() method from PageFactory Class as below,
//    Once we call initElements() method, all elements will get initialized. PageFactory.initElements() static method takes
//    the driver instance of the given class and the class type, and returns a Page Object with its fields fully initialized.
    public ConnectionDriver(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }





}
