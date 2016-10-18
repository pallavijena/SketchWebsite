package PageObjects

import Setup.Constants
import Setup.DriverCreation
import com.sun.java.util.jar.pack.Instruction
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
import org.openqa.selenium.support.ui.Select
import sun.java2d.loops.TransformHelper

import java.util.concurrent.TimeUnit

/**
 * Created by Pallavi on 9/29/2016.
 */
class TextTab {
    WebDriver driver=null
    @Before
    public void browserSetup()
    {
      //  driver= DriverCreation.getFireFoxDriver()
        driver= DriverCreation.getChromeDriver()
        driver.get("https://sketch.io/sketchpad/")
        driver.manage().window().maximize()
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES)
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS)
        Thread.sleep(2000)
    }

    @Test
    public void getTextBox()
    {
        driver.findElement(By.xpath(Constants.sketchpad_texticon_xpath)).click()
        Thread.sleep(1000)
        driver.findElement(By.xpath(Constants.sketchpad_canvas_xpath)).click()
        WebElement textarea= driver.findElement(By.xpath(Constants.sketchpad_texttab_textarea_xpath))
        Thread.sleep(2000)
        textarea.sendKeys("Hello World")
        Thread.sleep(2000)
        changeBlendSettings("Dark")
   //     driver.findElement(By.xpath(Constants.sketchpad_texttab_fillslider_xpath)).click()
        Thread.sleep(2000)
        changeFillSettings("color")
//        changeFillSettings("linear")
//        changeFillSettings("radial")
//        changeFillSettings("pattern")
        Thread.sleep(1000)
//        driver.findElement(By.className(Constants.sketchpad_texttab_outline_classname)).click()
        changeFontSettings("Alad")
        Thread.sleep(2000)
    }

    // changeBlendSettings method can be used to change the blend value for clipart and textbox

    public void changeBlendSettings(String blendval)
    {
        driver.findElement(By.xpath(Constants.sketchpad_texttab_blend_xpath)).click()
        Thread.sleep(2000)
        List <WebElement> blendType = driver.findElements(By.xpath("//*/div/ul/li"))
        for(WebElement i:blendType)
        {
            if (i.getText().contains(blendval))
            {
                i.click()
                break
            }
        }
        Thread.sleep(1000)
    }

    // changeFillSettings method can be used to change the fill value for textbox

    public void changeFillSettings(String fillByValue)
    {
        if (driver.findElement(By.xpath(Constants.sketchpad_texttab_fillslider_xpath)).isEnabled())
        {
            println("fill is enabled")
            driver.findElement(By.className(Constants.sketchpad_texttab_fill_classname)).click()
            switch (fillByValue)
            {
                case "color":
                    driver.findElement(By.xpath(Constants.sketchpad_texttab_fillColor_xpath)).click()
                    driver.findElement(By.xpath(Constants.sketchpad_texttab_fillColorName_xpath)).click()
                    Thread.sleep(1000)
                    break
                case "linear":
                    driver.findElement(By.xpath(Constants.sketchpad_texttab_fillLinear_xpath)).click()
                    driver.findElement(By.xpath(Constants.sketchpad_texttab_fillLinearName_xpath)).click()
                    Thread.sleep(1000)
                    break
                case "radial":
                    driver.findElement(By.xpath(Constants.sketchpad_texttab_fillRadial_xpath)).click()
                    driver.findElement(By.xpath(Constants.sketchpad_texttab_fillRadialName_xpath)).click()
                    Thread.sleep(1000)
                    break
                case "pattern":
                    driver.findElement(By.xpath(Constants.sketchpad_texttab_fillPattern_xpath)).click()
                    driver.findElement(By.xpath(Constants.sketchpad_texttab_fillPatternName_xpath)).click()
                    Thread.sleep(1000)
                    break
            }
            driver.findElement(By.xpath(Constants.sketchpad_texttab_fillGoBack_xpath)).click()
        }
        else
        {
            println("fill is Disabled")
        }
    }

    public void changeFontSettings(String fonttype, String fontAlign)
    {
       driver.findElement(By.xpath(Constants.sketchpad_texttab_font_xpath)).click()
       Thread.sleep(1000)
       List<WebElement> font= driver.findElements(By.xpath("html/body/div/ul/li"))
        println(font.size())
       for (WebElement i:font)
       {
           if (i.getText().contains(fonttype))
           {
               println(fonttype)
               i.click()
               break
           }
       }
        swi
    }
    @After
    public void browserClose()
    {
        driver.close()
    }
}
