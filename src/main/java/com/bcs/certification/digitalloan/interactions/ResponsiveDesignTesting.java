package com.bcs.certification.digitalloan.interactions;

import java.util.HashMap;
import java.util.Map;
//import org.junit.jupiter.params;
//import org.junit.jupiter.params.provider.MethodSource;
import com.bcs.certification.digitalloan.tasks.toAccess;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ResponsiveDesignTesting {

  /*  public ResponsiveDesignTesting() {
    }

    public static String[][] devices() {
        return new String[][]{{"iPad Pro"}, {"Galaxy Note 3"}, {"iPhone 6/7/8 Plus"}};
    }

    @MethodSource("devices")
    @ParameterizedTest
    void testResponsiveDesign(String modelName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        Map<String, String> deviceList = new HashMap();
        deviceList.put("deviceName", modelName);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("mobileEmulation", deviceList);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.cnn.com");
        driver.quit();
    }*/

    public static String[][] devices() {
        return new String[][]{
                {"iPad Pro"},
                {"Nexus 10"},
                {"iPhone 12 Pro"}

        };
    }
    public void valideResponsive(){
        Map<String, String> deviceMobEmu = new HashMap<>();
        deviceMobEmu.put("deviceName", "Nexus 5");
        ChromeOptions chromeOpt = new ChromeOptions();
        chromeOpt.setExperimentalOption("mobileEmulation", deviceMobEmu);
    }

}
