package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.apache.commons.io.FileUtils
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.rules.TestName
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver

import java.util.concurrent.TimeUnit

/**
 * Created by Pallavi on 10/18/2016.
 */
class PAGE_Base {

    WebDriver getDriver() {
        return driver
    }
    WebDriver driver
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

    @Rule
    public TestName testName=new TestName()

        @After
    public void browserClose()
    {
        File screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot,new File("ScreenShot\\"+testName.getMethodName()+".jpg"))
        driver.close()
    }
}
