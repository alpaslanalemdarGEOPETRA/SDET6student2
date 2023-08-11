package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Alpaslan {

    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();

        driver.get("https://form.jotform.com/221934510376353");


        WebElement isimKutusu= driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("ismet");


        WebElement soyIsimKutusu= driver.findElement(By.id("last_8"));
        soyIsimKutusu.sendKeys("Temur");



        MyFunc.Bekle(7);
        driver.quit();


    }
}
