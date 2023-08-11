package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_Alpaslan {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement labelFirstName= driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName = " + labelFirstName.getText());

        WebElement lastName= driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName = " + lastName.getText());


        MyFunc.Bekle(2);
        driver.quit();
    }
}
