package PageObjects

import Setup.Constants
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

/**
 * Created by Pallavi on 10/5/2016.
 */
class PAGE_About extends PAGE_Base {
    WebDriver driver

    @Test
    public void clickSketchIo( WebDriver driver)
    {
        driver.findElement(By.linkText(Constants.about_sketchio_linktext)).click()
    }

    public void clickSketchApi(WebDriver driver)
    {
        driver.findElement(By.linkText(Constants.about_sketchapi_linktext)).click()
    }

    public void clickSketchPad(WebDriver driver)
    {
        driver.findElement(By.linkText(Constants.about_sketchpad_linktext)).click()
    }
}
