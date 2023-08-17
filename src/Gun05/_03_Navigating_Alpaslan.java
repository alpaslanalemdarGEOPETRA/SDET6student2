package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Navigating_Alpaslan extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement alertElement=driver.findElement(By.id("alerttest"));
        alertElement.click();
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());







    }

}
