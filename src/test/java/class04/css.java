package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/cssSelector.php");
        driver.manage().window().maximize();

        //fill in profile if with css locator
        WebElement id=driver.findElement(By.cssSelector("input[id='profileID']"));
        id.sendKeys("Uzair Babar");

        //fill in profile box with shortcut
        WebElement profile=driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("hello");

        //fill in first feedback box
        WebElement feedBack1=driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedBack1.sendKeys("Website is not working");

        //fill in second feedback box using shortcut with . instead of spaces
        WebElement feedBack2=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedBack2.sendKeys("Website is working");

        //Contains method to fill course topic using * as contains
        WebElement course=driver.findElement(By.cssSelector("input[name*='contentInput']"));
        course.sendKeys("Selenium");

        //Start-with method using ^
        WebElement intro=driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        intro.sendKeys("Welcome");

        //Ends-with method using $
        WebElement conclusion=driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("Bye");
        Thread.sleep(2000);
        driver.quit();











    }
}
