package Setup

import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

/**
 * Created by Pallavi on 9/28/2016.
 */
class ConfigureCapabilities {
    public static ChromeOptions getChromeOptions()
    {
        //To disable extensions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("disable-plugins");
        options.addArguments("--disable-extensions");
        return options;
    }
}
