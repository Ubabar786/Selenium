package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class E2WindowHandles {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AYZoVheiFda0Bx6hs895k35oHvUltImPeH_9_ejU99VifJ30p9PlOJ79FzKDVSOtFb7QvBUW3xyBgg&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().window().maximize();

        //click on help
        WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));

        //click on privacy
        WebElement priv = driver.findElement(By.xpath("//a[text()='Privacy']"));
        help.click();
        priv.click();

        //get the window handle of the main page i.e. gmail.com and print it on the console
        String gmail = driver.getWindowHandle();
        System.out.println(gmail);

        //switch the focus of you webdriver to the privacy window
        Set<String> allHandles = driver.getWindowHandles();

        //loop through all the handles and find the desired one
        for(String handle:allHandles){
            //switch to the first handle in list
            driver.switchTo().window(handle);
            //get the title of the window on which the focus is
            String title = driver.getTitle();

            //check if the title matches your desired title, if yes break the loop, if no repeat process
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
