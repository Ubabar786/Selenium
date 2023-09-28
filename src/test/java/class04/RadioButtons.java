package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        //select the male radio button
        WebElement maleBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        maleBtn.click();

        //check if you were able to select the option or not
        boolean status = maleBtn.isSelected();
        if (status) {
            System.out.println("Male radio button was selected.");
        } else {
            System.out.println("Male radio button was not selected.");
        }

        //Check if the male button is enabled
        boolean status2 = maleBtn.isEnabled();
        System.out.println("The male radio button is enabled " + status2);

        //Check if the male radio button is displayed
        boolean status3 = maleBtn.isDisplayed();
        System.out.println("The male button is displayed " + status3);

        //From the age range select 5-15
        //Find all the elements that have the age range
        List<WebElement> ageRanges = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        for (WebElement ageRange : ageRanges) {
            //get the value of the attribute "value"
            String option = ageRange.getAttribute("value");
            if (option.equalsIgnoreCase("5 - 15")) {
                ageRange.click();
            }
        }
    }
}
