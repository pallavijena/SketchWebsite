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
 * Created by Rocky on 8/14/2016.
 */
class PAGE_BASE{
    WebDriver driver=null
    @Rule
    public TestName testName=new TestName()
    @Before
    public void driverCreation()
    {
        driver=DriverCreation.getChromeDriver()
        driver.get(Constants.url)
        driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.MINUTES)
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
        driver.manage().window().maximize()
    }

    @After
    public void exit()
    {
        File screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot,new File("ScreenShot\\"+testName.getMethodName()+".jpg"))
        driver.close()
    }
}