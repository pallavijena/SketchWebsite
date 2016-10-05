package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

/**
 * Created by Pallavi on 10/3/2016.
 */
class PAGE_Home {

    WebDriver driver
    public PAGE_Home(WebDriver driver)
    {
       this.driver=driver
    }
    public void gotoSketchpad()
    {
        driver.findElement(By.xpath(Constants.home_sketchpad_xpath)).click()
        Thread.sleep(3000)
    }

    public void gotoWebcam()
    {
        driver.findElement(By.xpath(Constants.home_webcam_xpath)).click()
        Thread.sleep(3000)}

    public void clickAbout()
    {
        driver.findElement(By.linkText(Constants.home_about_linktext)).click()
        Thread.sleep(3000)
    }
    public void clickContact()
    {
        driver.findElement(By.linkText(Constants.home_contact_linktext)).click()
        Thread.sleep(3000)
    }

}
