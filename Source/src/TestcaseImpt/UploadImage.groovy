package TestcaseImpt


import Setup.DriverCreation
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

/**
 * Created by Pallavi on 9/28/2016.
 */
class UploadImage {
    public static void main( String[] args)
    {
        WebDriver driver
        driver= DriverCreation.getChromeDriver()
        driver.get("https://sketch.io/sketchpad/")
        driver.manage().window().maximize()
        Thread.sleep(3000)
//Select Clipart
        WebElement clipart = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/span[4]")).click()
        Thread.sleep(6000)
//Upload image in clipart
        WebElement loadImage = driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/span/input"))
        Thread.sleep(1000)
        loadImage.sendKeys("C:/Users/Pallavi/Downloads/Tree.jpg")
        Thread.sleep(6000)
        UploadImage image1=new UploadImage()
        image1.changeSettings("Opacity",40,driver)
        image1.changeSettings("Saturation",45,driver)
        image1.changeSettings("tint",50,driver)
        image1.changeSettings("Temperature",55,driver)
        image1.changeSettings("Contrast",0.60,driver)
        image1.changeSettings("Brightness",65,driver)
        image1.changeSettings("Exposure",0.75,driver)
        image1.changeSettings("Sepia",20,driver)
        Thread.sleep(2000)
        image1.saveFile(driver)
        driver.close()
    }

    public void changeSettings (String settingType,float value, WebDriver driver)
    {
        WebElement opacitySlider= driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[2]/div/div"))
        WebElement opacityValue= driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[2]/span[2]/input"))
        WebElement saturationValue=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[2]/span[2]/input"))
        WebElement saturationSlider=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[2]/div/div"))
        WebElement tintValue=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[4]/span[2]/input"))
        WebElement tintSlider=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[4]/div/div"))
        WebElement temperatureValue=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[6]/span[2]/input"))
        WebElement temperatureSlider=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[6]/div/div"))
        WebElement contrastValue=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[8]/span[2]/input"))
        WebElement contrastSlider=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[8]/div/div"))
        WebElement brightnessValue=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[10]/span[2]/input"))
        WebElement brightnessSlider=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[10]/div/div"))
        WebElement exposureValue=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[12]/span[2]/input"))
        WebElement exposureSlider=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[12]/div/div"))
        WebElement sepiaValue=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[14]/span[2]/input"))
        WebElement sepiaSlider=driver.findElement(By.xpath("//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[14]/div/div"))
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

    public void saveFile(WebDriver driver)
    {
        driver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/span[3]")).click()
        Thread.sleep(10000)
        List<WebElement> ele=driver.findElements(By.xpath("//*"))
        for (WebElement temp:ele)
        {
            if(temp.getText().contains("PDF")&&temp.getTagName().equals("li"))
            {
                println "Element->"+temp.getText()+":"+temp.getTagName()+":"+temp.getProperties()
                temp.click()
                Thread.sleep(5000)
                break
            }
        }
    }
}
