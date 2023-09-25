package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        //instance
        WebDriver driver=new ChromeDriver();
        //navigate to the website
        driver.get("http://35.175.58.98/input-form-locator.php");
        //maximise window
        driver.manage().window().maximize();

        //locate the web element first name
        WebElement firstName=driver.findElement(By.id("first_name"));
        //use send keys to send the data to webelement
        firstName.sendKeys("Uzair");

        //locate the web element last name
        WebElement lastName=driver.findElement(By.name("last_name"));
        //use send keys to send the data to webelement
        lastName.sendKeys("Babar");

        //locate the web element email
        WebElement email=driver.findElement(By.className("form-control-01"));
        //use send keys to send the data to webelement
        email.sendKeys("ubabar786@yahoo.com");

        //locate the button and click on it
        WebElement submit=driver.findElement(By.tagName("button"));
        submit.click();

        //locate the web element LINK
        WebElement link=driver.findElement(By.linkText("Link"));
        link.click();

        //locate the web element click here using partial link text
        WebElement clickHere=driver.findElement(By.partialLinkText("Here."));
        clickHere.click();
    }

}
