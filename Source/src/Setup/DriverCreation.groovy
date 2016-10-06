package Setup

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities

/**
 * Created by Pallavi on 9/28/2016.
 */
class DriverCreation {
    public static WebDriver getChromeDriver()
    {
        System.setProperty("webdriver.chrome.driver","Dependencies\\chromedriver_win32\\chromedriver.exe")
        WebDriver driver=new ChromeDriver(ConfigureCapabilities.getChromeOptions())
        return driver
    }
    public static WebDriver getEdgeDriver()
    {
       // System.setProperty("webdriver.edge.driver", "C:\\Program Files\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
        WebDriver driver=new EdgeDriver()
        return driver
    }
    public static WebDriver getFireFoxDriver()
    {
        /*System.setProperty("marionette","C:\\Users\\Pallavi\\IdeaProjects\\Browser Setups\\Firefox_driver\\wires.exe")
        DesiredCapabilities capabilities = DesiredCapabilities.firefox()
        capabilities.setCapability("marionette", true)
        WebDriver driver = new FirefoxDriver(capabilities)*/
        WebDriver driver =new FirefoxDriver();
        return driver
    }
}
