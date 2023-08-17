package UtilityOfAlpaslan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriverAlpaslan {

    public static WebDriver driver;

    public static void DriverStartChrome()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // sayfayı yükleme mühleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // elementi bulma mühleti
    }

    public static void WaitAndOff()
    {
        wait(5);
        driver.quit();
    }


    public static void wait(int sec){

        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



}
