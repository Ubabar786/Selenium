package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver = new ChromeDriver();
        //go to demoqa xpath
        driver.get("https://demoqa.com/text-box");
        //maximise the window
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
        userName.sendKeys("Uzair Babar");

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("Uzair123@hotmail.com");

        WebElement currAddress = driver.findElement(By.xpath("//textarea[starts-with(@id,'current')]"));
        currAddress.sendKeys("541, Ilford Lane, Ilford, Essex, IG1 3LA");

        WebElement permAddress = driver.findElement(By.xpath("//textarea[starts-with(@id,'permanent')]"));
        permAddress.sendKeys("121, Main Street, Enfield, London, N11 5GP");

        WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        // js.executeScript(“window.scrollTo(0, document.body.scrollHeight)”);
        Thread.sleep(4000);

        submit.click();

        driver.quit();

    }
}