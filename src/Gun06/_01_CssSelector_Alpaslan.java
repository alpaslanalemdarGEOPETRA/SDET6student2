package Gun06;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector_Alpaslan extends BaseDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesagge="Merhaba";
        WebElement inputPlace = driver.findElement(By.cssSelector("input[id='user-message']"));
        inputPlace.sendKeys(mesagge);
        WebElement clicking = driver.findElement(By.cssSelector("[onclick=\"showInput();\"]"));

        clicking.click();


        WebElement display = driver.findElement(By.cssSelector("div#user-message span"));
        String displayText = display.getText();

        System.out.println("displayText = " + displayText);

        if (displayText.contains(mesagge)) {
            System.out.println("Successfull");
        } else
            System.out.println("FAILED");


        //[onclick="showInput();"]        for clicking
        //[id='get-input'] label+input    for input vlaue
        //div#user-message span           for display


        BekleVeKapat();
    }
}
