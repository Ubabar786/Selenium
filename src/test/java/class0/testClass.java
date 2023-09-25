package class0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
