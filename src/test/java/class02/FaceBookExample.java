package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookExample {
    public static void main(String[] args) {
        //instance
        WebDriver driver=new ChromeDriver();
        //go to facebook
        driver.get("https://www.facebook.com/");
        //maximise the window
        driver.manage().window().maximize();

        //find th email address
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("ubabar786@yahoo.com");

        //find the password
        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("abracadabra");

        //find the login button
        WebElement login=driver.findElement(By.name("login"));
        login.click();


    }
}
