package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //go to google.com
        driver.get("https://www.google.com/");
        // Maximise the window
        driver.manage().window().maximize();
        //slow down to observe process
        Thread.sleep(2000);
        //go to facebook.com
        driver.navigate().to("https://www.facebook.com");
        //slow down to observe process
        Thread.sleep(2000);
        //go back to google.com
        driver.navigate().back();
        //slow down to observe process
        Thread.sleep(2000);
        //go forward
        driver.navigate().forward();
        //slow down to observe process
        Thread.sleep(2000);
        //refresh page
        driver.navigate().refresh();
        //close browser
        driver.close();
        //also we can use .quit()
       // driver.quit();

    }
}
