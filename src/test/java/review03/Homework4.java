package review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class Homework4 extends CommonMethods {

    public static void main(String[] args) {
        String url = "http://35.175.58.98/table-search-filter-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

//        get the column status
        List<WebElement> statuses = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));

        for (int i = 0; i < statuses.size(); i++) {

            String currentStatus = statuses.get(i).getText();

            if (currentStatus.equals("in progress")) {

                System.out.println("the row number which has in progress is " +i);
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + (i + 1) + "]"));
                System.out.println(row.getText());
            }
        }
           /*
        int i=0;
        for(WebElement status: statuses){
            String text= status.getText();
            if(text.equals("in progress")){
                WebElement row= driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + (i+1) + "]"));
                System.out.println(row.getText());
            }i++;
        } */
    }
}
