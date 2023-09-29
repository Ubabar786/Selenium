package review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateVsGet {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();

        //find the button create new account
        WebElement createNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAcc.click();
        //sleep to give the browser efficient time to catch up to the code
        Thread.sleep(1000);

        //fill in first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Uzair");

        System.out.println(driver.getTitle());



    }
}
