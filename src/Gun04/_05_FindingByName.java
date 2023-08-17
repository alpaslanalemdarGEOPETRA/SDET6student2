package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        // textBox ları name ile bulup adınızı ve soyadınız doldurun
        // ve butonu da id veya name ile bulup tıklatın

     // WebElement firstName=driver.findElement(By.name("q8_name[first]")); //name ile bulma
     // firstName.sendKeys("ismet");

     // WebElement lastName=driver.findElement(By.name("q8_name[last]")); //name ile bulma
     // lastName.sendKeys("temur");

     // WebElement btnSubmit=driver.findElement(By.id("input_2"));
     // btnSubmit.click();

        List<WebElement> labels=driver.findElements(By.className("sf-dod-mpQGL"));

        for ( WebElement e : labels
             ) {

            System.out.println("e.getText() = " + e.getText());
            
        }




        MyFunc.Bekle(5);
        driver.quit();
    }
}
