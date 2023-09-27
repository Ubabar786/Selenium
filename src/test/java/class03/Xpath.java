package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {


        //instance
        WebDriver driver = new ChromeDriver();

        //go to syntax xpath
        driver.get("http://35.175.58.98/Xpath.php");

        //maximise the window
        driver.manage().window().maximize();

        //find the text box and send some keys
        WebElement textBox1 = driver.findElement(By.xpath("//input[@id='title']"));
        textBox1.sendKeys("batch17");

        //find the next text box and send keys
        WebElement textBox2 = driver.findElement(By.xpath("//input[@name='title']"));
        textBox2.sendKeys("batch17");

        //send the security question
        WebElement q1 = driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        q1.sendKeys("Whats the colour of the sun?");

        //get the text
        WebElement theMagicalText = driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(theMagicalText.getText());

        //get the text box
        WebElement textBox3 = driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
        textBox3.sendKeys("abracadabra");

        //get the email1
        WebElement email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("hello123@gmail.com");

        //get the email2
        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("hi123@gmail.com");

        //get the email3
        WebElement email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("hola123@gmail.com");

        //get the below fields
        WebElement field1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("cat");

        WebElement field2 = driver.findElement(By.xpath("//input[@name='customField' and @data-detail='two']"));
        field2.sendKeys("mouse");

        WebElement field3 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField1']"));
        field3.sendKeys("horse");

        WebElement field4 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField1']"));
        field4.sendKeys("pony");
    }
}
