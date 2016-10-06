package Setup

/**
 * Created by Pallavi on 9/29/2016.
 */
class Constants {
    /*
      Elements are represented in the format : SCREEN NAME_ELEMENT NAME_ELEMENT IDENTIFIER
     */

    // Website URL
    public static String url = "https://sketch.io"

    //Home screen Variables
    public static String home_sketchpad_xpath = "//*[@id=\"apps\"]/div/a[1]/img"
    public static String home_webcam_xpath = "//*[@id=\"apps\"]/div/a[2]/img"
    public static String home_about_linktext = "ABOUT"
    public static String home_contact_linktext = "CONTACT"

    // Sketchpad screen variables
    public static String sketchpad_tool_xpath="/html/body/div[2]/div[2]/span/span[1]"
    public static String sketchpad_select_linktext="SELECT"
    public static String sketchpad_pen_xpath="//*[@id=\"sk-configure\"]/div[1]"

    //Webcam Screen Variables
    public static String webcam_title_xpath="//*[@id=\"alertify\"]/div/article/span/div/h1/span"

    //About Page variables
    public static String about_sketchio_linktext = "Sketch.IO"
    public static String about_sketchapi_linktext = "SketchAPI"
    public static String about_sketchpad_linktext = "Sketchpad"
    public static String about_sketchioText_xpath = "//*[@id=\"content_wrapper\"]/div/p[1]"

    //Contact Page variables



    // Tab Names
    public static String clipart_cliparticon_xpath = "/html/body/div[2]/div[1]/div[2]/span[4]"
    // Clipart Tab
    public static String clipart_loadyourownimage_xpath="//*[@id=\"sk-configure\"]/div[2]/span/input"
    //Image Settings
    public static String clipart_opacitySlider_xpath= "//*[@id=\"sk-configure\"]/div[2]/div[2]/div/div"
    public static String clipart_opacityValue_xpath= "//*[@id=\"sk-configure\"]/div[2]/div[2]/span[2]/input"
    public static String clipart_saturationValue_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[2]/span[2]/input"
    public static String clipart_saturationSlider_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[2]/div/div"
    public static String clipart_tintValue_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[4]/span[2]/input"
    public static String clipart_tintSlider_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[4]/div/div"
    public static String clipart_temperatureValue_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[6]/span[2]/input"
    public static String clipart_temperatureSlider_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[6]/div/div"
    public static String clipart_contrastValue_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[8]/span[2]/input"
    public static String clipart_contrastSlider_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[8]/div/div"
    public static String clipart_brightnessValue_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[10]/span[2]/input"
    public static String clipart_brightnessSlider_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[10]/div/div"
    public static String clipart_exposureValue_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[12]/span[2]/input"
    public static String clipart_exposureSlider_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[12]/div/div"
    public static String clipart_sepiaValue_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[14]/span[2]/input"
    public static String clipart_sepiaSlider_xpath="//*[@id=\"sk-configure\"]/div[2]/div[3]/div/div[2]/div[14]/div/div"

    // Default Elements in all tabs

    public static String home_export_xpath="html/body/div[2]/div[1]/div[1]/span[3]"


}
