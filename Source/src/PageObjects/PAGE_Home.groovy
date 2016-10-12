package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.apache.commons.io.FileUtils
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestName
import org.openqa.selenium.By
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import java.util.concurrent.TimeUnit

/**
 * Created by Pallavi on 10/3/2016.
 */

class PAGE_Home extends PAGE_BASE{

    WebDriver driver
    @Test
    public void gotoSketchpad(WebDriver driver)

    {
        driver.findElement(By.xpath(Constants.home_sketchpad_xpath)).click()
        Thread.sleep(3000)
    }

    public void gotoWebcam()
    {
        driver.findElement(By.xpath(Constants.home_webcam_xpath)).click()
        Thread.sleep(3000)}

    public void clickAbout(WebDriver driver)
    {
        driver.findElement(By.linkText(Constants.home_about_linktext)).click()
        Thread.sleep(3000)
    }
    public void clickContact()
    {
        driver.findElement(By.linkText(Constants.home_contact_linktext)).click()
        Thread.sleep(3000)
    }

    @Rule
    public TestName testName=new TestName()
    @Before
    public void browserSetup()
    {
        driver= DriverCreation.getChromeDriver()
        driver.get(Constants.url)
        driver.manage().window().maximize()
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES)
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS)
        Thread.sleep(2000)
    }

    @After
    public void browserClose()
    {
        File screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot,new File("ScreenShot\\"+testName.getMethodName()+".jpg"))
        driver.close()
    }

}
