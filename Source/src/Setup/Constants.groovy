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
    public static String sketchpad_cliparticon_xpath = "/html/body/div[2]/div[1]/div[2]/span[4]"
    public static String sketchpad_texticon_xpath = "/html/body/div[2]/div[1]/div[2]/span[5]"
    public static String sketchpad_canvas_xpath = "/html/body/div[2]/div[3]/div/div[2]/div[2]/canvas[3]"


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

    //TextTab Variables in SketchPad Page
    public static String sketchpad_texttab_fillslider_xpath="//*[@id=\"sk-configure\"]/div[2]/label[3]/div/div/div"
    public static String sketchpad_texttab_outline_classname="stroke-indicator"
    public static String sketchpad_texttab_textarea_xpath = "/html/body/div[2]/div[3]/div/div[2]/div[5]/div"
    public static String sketchpad_texttab_blend_xpath = ".//*[@id='composite']/div/span[2]"
    public static String sketchpad_texttab_fill_classname ="fill-indicator"
    public static String sketchpad_texttab_fillColor_xpath ="//*[@id=\"sk-palette\"]/div[1]/ol/span[1]"
    public static String sketchpad_texttab_fillColorName_xpath ="//*[@id=\"color_b868a18\"]/canvas"
    public static String sketchpad_texttab_fillLinear_xpath ="//*[@id=\"sk-palette\"]/div[1]/ol/span[2]"
    public static String sketchpad_texttab_fillLinearName_xpath ="//*[@id=\"gradient_8ed42c34\"]/canvas"
    public static String sketchpad_texttab_fillRadial_xpath ="//*[@id=\"sk-palette\"]/div[1]/ol/span[3]"
    public static String sketchpad_texttab_fillRadialName_xpath ="//*[@id=\"gradient_31ec35ef\"]/canvas"
    public static String sketchpad_texttab_fillPattern_xpath ="//*[@id=\"sk-palette\"]/div[1]/ol/span[4]"
    public static String sketchpad_texttab_fillPatternName_xpath="//*[@id=\"pattern_a426c15e\"]/canvas"
    public static String sketchpad_texttab_fillGoBack_xpath="//*[@id=\"sk-configure\"]/div[1]/span"
    public static String sketchpad_texttab_font_xpath="//*[@id=\"sk-configure\"]/div[2]/label[1]/div/div/span[1]"
    public static String sketchpad_texttab_fontLeft_xpath=".//*[@id='sk-configure']/div[2]/div[2]/span[1]"
    public static String sketchpad_texttab_fontCenter_xpath=".//*[@id='sk-configure']/div[2]/div[2]/span[2]"
    public static String sketchpad_texttab_fontRight_xpath=".//*[@id='sk-configure']/div[2]/div[2]/span[3]"
    public static String sketchpad_texttab_fontJustify_xpath=".//*[@id='sk-configure']/div[2]/div[2]/span[4]"
    public static String sketchpad_texttab_fontBold_xpath=".//*[@id='sk-configure']/div[2]/div[3]/span[1]"
    public static String sketchpad_texttab_fontItalics_xpath=".//*[@id='sk-configure']/div[2]/div[3]/span[2]"
    public static String sketchpad_texttab_fontUnderline_xpath=".//*[@id='sk-configure']/div[2]/div[3]/span[3]"
    public static String sketchpad_texttab_fontStrike_xpath=".//*[@id='sk-configure']/div[2]/div[3]/span[4]"

}
