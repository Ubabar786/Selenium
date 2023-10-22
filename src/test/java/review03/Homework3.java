package review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class Homework3 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement checkBoxBtn = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkBoxBtn.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

        boolean stateOfCheckBox = driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected();
        System.out.println(stateOfCheckBox);

    }
}
