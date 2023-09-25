package class01;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
//   Declare the instance of WebDriver
        WebDriver driver = new ChromeDriver();

        // Use the driver.get() method
        driver.get("https://www.google.com/");

        // Maximise your window maximise() method
        driver.manage().window().maximize();

        // Get the url of the website
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current URL is: "+ currentUrl);

        // Get the title of website
        String title = driver.getTitle();
        System.out.println("The title of the page is: "+title);

        // Added a wait for 2 seconds to slow the closing of window
        // Delete the sleep after you are done observing the script
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
