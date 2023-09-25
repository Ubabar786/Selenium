package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        //locate the web element for username
        WebElement userName = driver.findElement(By.name("username"));

        //write text into the element
        userName.sendKeys("abc");

        Thread.sleep(3000);

        //clearing username
        userName.clear();
        userName.sendKeys(Keys.CONTROL + "a");

        Thread.sleep(3000);

        //Entering the Admin username
        userName.sendKeys("Admin");

        Thread.sleep(3000);
        //Entering password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        Thread.sleep(3000);
        //Get the text from the login button web element and print it on the console.
        WebElement login = driver.findElement(By.tagName("button"));
        String text = login.getText();

        System.out.println(text);

        //Click on the login button.
        login.click();
    }
}
