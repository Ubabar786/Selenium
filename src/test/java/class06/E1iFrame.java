package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E1iFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        //write down the topic
        //switch to the correct iFrame
        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("Hello");
        Thread.sleep(3000);
        //click on checkBox
        //using the name or id method
        driver.switchTo().frame("checkboxIframe");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        Thread.sleep(3000);

        //select the animal baby cat from the dropdown
        driver.switchTo().defaultContent();
        WebElement dd = driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
        driver.switchTo().frame(dd);
        //find the web element
        WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel=new Select(animals);
        sel.selectByVisibleText("Baby Cat");
        Thread.sleep(3000);

        driver.quit();
    }
}
