package Gun05;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_FindingElements_tag_Alpaslan {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");


        
        List<WebElement> links= driver.findElements(By.tagName("a"));

        for (WebElement e: links){

            System.out.println("e.getText() = " + e.getText());
            
        }





        MyFunc.Bekle(5);
        driver.quit();
    }
}
