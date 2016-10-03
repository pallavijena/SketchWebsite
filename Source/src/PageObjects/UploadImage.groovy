package PageObjects

import Setup.Constants
import Setup.DriverCreation
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

/**
 * Created by Pallavi on 9/28/2016.
 */
class UploadImage {
    WebDriver driver
    @Before
    public void driverCreation()
    {
        driver= DriverCreation.getChromeDriver()
        driver.get(Constants.url)
        driver.manage().window().maximize()
        Thread.sleep(3000)
    }
    @Test
    public void uploadImage()
    {
        //Select Clipart tab
        WebElement clipart = driver.findElement(By.xpath(Constants.clipart_cliparticon_xpath)).click()
        Thread.sleep(6000)
        //Upload image in clipart
        WebElement loadImage = driver.findElement(By.xpath(Constants.clipart_loadyourownimage_xpath))
        Thread.sleep(1000)
        loadImage.sendKeys("C:/Users/Pallavi/Downloads/Tree.jpg")
        Thread.sleep(2000)
        //UploadImage image1=new UploadImage()
        changeSettings("Opacity",40)
        changeSettings("Saturation",45)
        changeSettings("tint",50)
        changeSettings("Temperature",55)
        changeSettings("Contrast",0.60)
        changeSettings("Brightness",65)
        changeSettings("Exposure",0.75)
        changeSettings("Sepia",20)
        Thread.sleep(2000)
        saveFile()
    }

    public void changeSettings (String settingType,float value)
    {
        WebElement opacitySlider= driver.findElement(By.xpath(Constants.clipart_opacitySlider_xpath))
        WebElement opacityValue= driver.findElement(By.xpath(Constants.clipart_opacityValue_xpath))
        WebElement saturationValue=driver.findElement(By.xpath(Constants.clipart_saturationValue_xpath))
        WebElement saturationSlider=driver.findElement(By.xpath(Constants.clipart_saturationSlider_xpath))
        WebElement tintValue=driver.findElement(By.xpath(Constants.clipart_tintValue_xpath))
        WebElement tintSlider=driver.findElement(By.xpath(Constants.clipart_tintSlider_xpath))
        WebElement temperatureValue=driver.findElement(By.xpath(Constants.clipart_temperatureValue_xpath))
        WebElement temperatureSlider=driver.findElement(By.xpath(Constants.clipart_temperatureSlider_xpath))
        WebElement contrastValue=driver.findElement(By.xpath(Constants.clipart_contrastValue_xpath))
        WebElement contrastSlider=driver.findElement(By.xpath(Constants.clipart_contrastSlider_xpath))
        WebElement brightnessValue=driver.findElement(By.xpath(Constants.clipart_brightnessValue_xpath))
        WebElement brightnessSlider=driver.findElement(By.xpath(Constants.clipart_brightnessSlider_xpath))
        WebElement exposureValue=driver.findElement(By.xpath(Constants.clipart_exposureValue_xpath))
        WebElement exposureSlider=driver.findElement(By.xpath(Constants.clipart_exposureSlider_xpath))
        WebElement sepiaValue=driver.findElement(By.xpath(Constants.clipart_sepiaValue_xpath))
        WebElement sepiaSlider=driver.findElement(By.xpath(Constants.clipart_sepiaSlider_xpath))
        switch (settingType)
        {
            case "Opacity":
                opacityValue.click()
                opacityValue.sendKeys(Keys.chord(Keys.CONTROL, "a"))
                Thread.sleep(2000)
                opacityValue.sendKeys(Float.toString(value))
                Thread.sleep(1000)
                opacitySlider.click()
                Thread.sleep(1000)
                break
            case "Saturation":
                saturationValue.click()
                saturationValue.sendKeys(Keys.chord(Keys.CONTROL, "a"))
                Thread.sleep(2000)
                saturationValue.sendKeys(Float.toString(value))
                Thread.sleep(1000)
                saturationSlider.click()
                Thread.sleep(1000)
                break
            case "tint":
                tintValue.click()
                tintValue.sendKeys(Keys.chord(Keys.CONTROL, "a"))
                Thread.sleep(2000)
                tintValue.sendKeys(Float.toString(value))
                Thread.sleep(1000)
                tintSlider.click()
                Thread.sleep(1000)
                break
            case "Temperature":
                temperatureValue.click()
                temperatureValue.sendKeys(Keys.chord(Keys.CONTROL, "a"))
                Thread.sleep(2000)
                temperatureValue.sendKeys(Float.toString(value))
                Thread.sleep(1000)
                temperatureSlider.click()
                Thread.sleep(1000)
                break
            case "Contrast":
                contrastValue.click()
                contrastValue.sendKeys(Keys.chord(Keys.CONTROL, "a"))
                Thread.sleep(2000)
                contrastValue.sendKeys(Float.toString(value))
                Thread.sleep(1000)
                contrastSlider.click()
                Thread.sleep(1000)
                break
            case "Brightness":
                brightnessValue.click()
                brightnessValue.sendKeys(Keys.chord(Keys.CONTROL, "a"))
                Thread.sleep(2000)
                brightnessValue.sendKeys(Float.toString(value))
                Thread.sleep(1000)
                brightnessSlider.click()
                Thread.sleep(1000)
                break
            case "Exposure":
                exposureValue.click()
                exposureValue.sendKeys(Keys.chord(Keys.CONTROL, "a"))
                Thread.sleep(2000)
                exposureValue.sendKeys(Float.toString(value))
                Thread.sleep(1000)
                exposureSlider.click()
                Thread.sleep(1000)
                break
            case "Sepia":
                sepiaValue.click()
                sepiaValue.sendKeys(Keys.chord(Keys.CONTROL, "a"))
                Thread.sleep(2000)
                sepiaValue.sendKeys(Float.toString(value))
                Thread.sleep(1000)
                sepiaSlider.click()
                Thread.sleep(1000)
                break
        }

    }

    public void saveFile()
    {
        driver.findElement(By.xpath(Constants.home_export_xpath)).click()
        Thread.sleep(10000)
        List<WebElement> ele=driver.findElements(By.xpath("//*"))
        for (WebElement temp:ele)
        {
            if(temp.getText().contains("PDF")&&temp.getTagName().equals("li"))
            {
                temp.click()
                Thread.sleep(5000)
                break
            }
        }
    }

    @After
    public void exit()
    {
        driver.close()
    }

}
