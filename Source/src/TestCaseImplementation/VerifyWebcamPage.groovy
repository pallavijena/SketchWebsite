package TestCaseImplementation

import PageObjects.PAGE_Home
import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import java.util.concurrent.TimeUnit

/**
 * Created by Pallavi on 10/5/2016.
 * This test is to verify if user is able to navigate to the webcam page and successfully return back to home screen
 */
class VerifyWebcamPage extends PAGE_Home{
    WebDriver driver
    @Before
    public void browserSetup()
    {
        driver=DriverCreation.getFireFoxDriver()
        driver.get(Constants.url)
        driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.MINUTES)
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS)
        driver.manage().window().maximize()
        Thread.sleep(2000)
    }

    @Test
    public void verifyWebcamPage()
    {
        PAGE_Home homepage = new PAGE_Home(driver)
        homepage.gotoWebcam()
        Thread.sleep(6000)
        assert driver.findElement(By.xpath(Constants.webcam_title_xpath)).getText().equals("Webcam FX")
        driver.navigate().back()
        Thread.sleep(2000)
    }
    @After
    public void browserClose()
    {

        driver.close()
    }
}
