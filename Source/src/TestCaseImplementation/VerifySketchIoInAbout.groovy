package TestCaseImplementation

import PageObjects.PAGE_About
<<<<<<< HEAD
import PageObjects.PAGE_Base
=======
import PageObjects.PAGE_BASE
>>>>>>> eb839180ee71f1e955b81155351ff8d4e632d88e
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
 */
<<<<<<< HEAD
class VerifySketchIoInAbout extends PAGE_Base {
    //WebDriver driver
    @Test
    public void verifySketchIoLink()
    {
        PAGE_Home home= new PAGE_Home()
        PAGE_About about = new PAGE_About()
        home.clickAbout(driver)
        Thread.sleep(1000)
        about.clickSketchIo(driver)
        Thread.sleep(1000)
        assert driver.findElement(By.xpath(Constants.about_sketchioText_xpath)).getText().contains("Sketch.IO creates")
        Thread.sleep(1000)
    }

=======
class VerifySketchIoInAbout extends PAGE_BASE{

    @Test
    public void verifySketchIoLink()
    {
        PAGE_Home homepage=new PAGE_Home();
        homepage.clickAbout(driver)
        Thread.sleep(1000)
//        about.clickSketchIo()
//        Thread.sleep(1000)
//        assert driver.findElement(By.xpath(Constants.about_sketchioText_xpath)).getText().contains("Sketch.IO creates")
//        Thread.sleep(1000)
    }
>>>>>>> eb839180ee71f1e955b81155351ff8d4e632d88e
}
