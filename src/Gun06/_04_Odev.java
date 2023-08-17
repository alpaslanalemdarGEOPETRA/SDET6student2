package Gun06;

// 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
// 2- Business i çekleyin.
// 3- discover XYZ ye tıklatın ve online Advertising i seçin
// 4- Every day i seçin
// 5- Good u seçin
// 6- using XYZ yi tıklatın ve 3.seçeneği seçin
// css selector
// her bir tıklatma vs işlemin arasına MyFunc.Bekle(2);

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Odev extends BaseDriver {


    @Test

    public void test1() {


        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement bussinessClick = driver.findElement(By.cssSelector("input#u_yRz_4586_0"));
        bussinessClick.click();

        MyFunc.Bekle(2);


        WebElement onlineAdvertisingClick = driver.findElement(By.cssSelector("#u_yRz_4588 > :nth-child(4)"));
        onlineAdvertisingClick.click();

        MyFunc.Bekle(2);


        WebElement everyDayClick = driver.findElement(By.cssSelector("[for=\"u_yRz_89585_0\"] > span"));
        everyDayClick.click();

        MyFunc.Bekle(2);


        WebElement goodClick = driver.findElement(By.cssSelector("[for=\"u_yRz_4589_0\"] > span"));
        goodClick.click();

        MyFunc.Bekle(2);


        WebElement thirdClick = driver.findElement(By.cssSelector("#u_yRz_4597 > :nth-child(3)"));
        thirdClick.click();

        MyFunc.Bekle(2);



        BekleVeKapat();

    }
}
