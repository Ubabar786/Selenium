package review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class Homework2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/synchronization-waits.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement clickBtn = driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        clickBtn.click();
        WebElement radioBtn = driver.findElement(By.xpath("//input[@value='Male']"));
        radioBtn.click();

    }
}
