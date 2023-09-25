package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();

        //enter username
        WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Ubabar");

        Thread.sleep(2000);

        //clear the text box and resend the username
        userName.clear();
        userName.sendKeys("Admin");

        //to send the password
        WebElement passWord=driver.findElement(By.name("txtPassword"));
        passWord.sendKeys("Hum@nhrm123");

        //to click on login button
        WebElement login=driver.findElement(By.className("button"));
        login.click();

        //get the text welcome admin and print on the console
        WebElement welcome=driver.findElement(By.linkText("Welcome Admin"));
        String msg=welcome.getText();
        System.out.println("The message is: "+msg);


    }
}
