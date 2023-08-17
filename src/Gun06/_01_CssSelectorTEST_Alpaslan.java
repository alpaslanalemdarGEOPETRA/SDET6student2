package Gun06;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class _01_CssSelectorTEST_Alpaslan extends BaseDriver {


    @Test                  // sen bir testsin
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesagge = "Merhaba";
        WebElement inputPlace = driver.findElement(By.cssSelector("input[id='user-message']"));
        inputPlace.sendKeys(mesagge);
        WebElement clicking = driver.findElement(By.cssSelector("[onclick=\"showInput();\"]"));

        clicking.click();


        WebElement display = driver.findElement(By.cssSelector("div#user-message span"));
        String displayText = display.getText();

        System.out.println("displayText = " + displayText);

       Assert.assertTrue("Aranınlan mesaj bulunamadı",displayText.contains(mesagge+"kfvrork"));


        //[onclick="showInput();"]        for clicking
        //input[id='user-message']        for input vlaue
        //div#user-message span           for display


        BekleVeKapat();
    }
}
