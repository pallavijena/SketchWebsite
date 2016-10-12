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
import org.openqa.selenium.support.ui.Select

import java.util.concurrent.TimeUnit

/**
 * Created by Pallavi on 9/29/2016.
 */
class TextTab {
    WebDriver driver=null
    @Before
    public void browserSetup()
    {
        driver= DriverCreation.getChromeDriver()
        driver.get("https://sketch.io/sketchpad/")
        driver.manage().window().maximize()
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES)
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS)
        Thread.sleep(2000)
    }

    @Test
    public void textBox()
    {
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/span[5]")).click()
        Thread.sleep(1000)
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[2]/canvas[3]")).click()
        driver.findElement(By.xpath(".//*[@id='composite']/div/span[2]")).click();
        Thread.sleep(2000)
        List<WebElement> list=driver.findElements(By.xpath("//*/div/ul/li"))
        for(WebElement e:list)
        {
            if(e.getText().contains("Color"))
            {
                e.click()
                break
            }
        }
        Thread.sleep(4000)
        driver.findElement(By.xpath("html/body/div[11]/ul/li[26]/span/span")).click()
        Thread.sleep(4000)

//        WebElement textarea= driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[5]/div"))
//        Thread.sleep(2000)
//        textarea.sendKeys("Hello World")
//        Thread.sleep(3000)
//        //driver.findElement(By.className("sk-tool")).click()
//        driver.findElement(By.xpath("//*[@id=\"composite\"]/div/span[1]")).click()
//        Thread.sleep(1000)
////        WebElement blend= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/span[3]"))
////        blend.click()
////        Select blendValue= new Select(blend)
////        blendValue.selectByVisibleText("Multiply")
////        driver.findElement(By.xpath("//*[@id=\"composite\"]/div/span[1]"))
//        List<WebElement> blendValues= driver.findElements(By.xpath("//*[@id=\"composite\"]/div"))
//        println(blendValues.size())
//        for(int i=0; i<blendValues.size();i++)
//        {
//
//            String temp = blendValues.get(i).getText();
//            if (temp.equals("Multiply"))
//            {
//                blendValues.get(i).click();
//                break;
//            }
//        }
//        Thread.sleep(3000)
    }

    @After
    public void browserClose()
    {
        driver.close()
    }
}
