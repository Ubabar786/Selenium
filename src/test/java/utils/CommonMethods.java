package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url, String browser){
        switch(browser){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "firefox":
                driver=new EdgeDriver();
                break;
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public static void closeBrowser(){
        driver.quit();
    }
}
