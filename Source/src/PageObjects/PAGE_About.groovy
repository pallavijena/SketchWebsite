package PageObjects

import Setup.Constants
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.annotations.Test

/**
 * Created by Pallavi on 10/5/2016.
 */
class PAGE_About extends PAGE_BASE{
    WebDriver driver

    @Test
    public checkAboutPage()
    {

    }
    public void clickSketchIo()
    {
        driver.findElement(By.linkText(Constants.about_sketchio_linktext)).click()
    }

    public void clickSketchApi()
    {
        driver.findElement(By.linkText(Constants.about_sketchapi_linktext)).click()
    }

    public void clickSketchPad()
    {
        driver.findElement(By.linkText(Constants.about_sketchpad_linktext)).click()
    }
}
