package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Alpaslan {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement name= driver.findElement(By.name("q8_name[first]"));
        name.sendKeys("Alpaslan");

        WebElement lastname= driver.findElement(By.name("q8_name[last]"));
        lastname.sendKeys("Alemdar");

        WebElement submitButton= driver.findElement(By.id("input_2"));


        submitButton.click();



        MyFunc.Bekle(5);
        driver.quit();
    }
}

