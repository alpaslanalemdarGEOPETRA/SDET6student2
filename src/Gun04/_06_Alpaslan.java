package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_Alpaslan {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");



        WebElement nameByClassName= driver.findElement(By.className("form-textbox"));
        nameByClassName.sendKeys("Alpaslan");



    }
}
