package review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php.");
        driver.manage().window().maximize();

        //check if the checkbox1 is enabled
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));

        for (WebElement checkBox : checkBoxes) {
            String option = checkBox.getAttribute("value");

            if (option.equals("Checkbox-1")) {
                boolean status = checkBox.isEnabled();
                System.out.println(status);

                if (!status) {
                    WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
                    enableBtn.click();

                    boolean status2 = checkBox.isEnabled();
                    if (status2) {
                        checkBox.click();
                        boolean isSelected = checkBox.isSelected();
                        System.out.println(isSelected);
                    }
                }
            }
        }
    }
}
