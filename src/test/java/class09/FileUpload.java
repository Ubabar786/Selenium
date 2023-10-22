package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/upload-image.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
//        find the upload element
        WebElement fileUpload = driver.findElement(By.xpath("//input[@id='image-file']"));

//        make sure to change the path
        fileUpload.sendKeys("C:\\Users\\babar\\OneDrive\\Desktop\\Git Directories.png");


    }
}
