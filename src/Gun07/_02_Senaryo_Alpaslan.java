package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_Senaryo_Alpaslan extends BaseDriver {

    @Test

    public void test(){

        driver.get("https://www.saucedemo.com/");

        String name="standard_user";


        WebElement nameEntry= driver.findElement(By.xpath("//input[@id='user-name']"));
        nameEntry.sendKeys(name);

        MyFunc.Bekle(2);


        String password="secret_sauce";

        WebElement passwordEntry= driver.findElement(By.xpath("//input[@id='password']"));
        passwordEntry.sendKeys(password);

        MyFunc.Bekle(2);


        WebElement login= driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        MyFunc.Bekle(2);



        WebElement product1= driver.findElement(By.xpath("//a[@id='item_4_title_link']"));
        product1.click();

        MyFunc.Bekle(2);



        WebElement addToCart= driver.findElement(By.xpath("//button[@class=\"btn btn_primary btn_small btn_inventory\"]"));
        addToCart.click();

        MyFunc.Bekle(2);


        driver.navigate().back();


        WebElement product2= driver.findElement(By.xpath("//a[@id='item_0_title_link']"));
        product2.click();

        MyFunc.Bekle(2);


        WebElement addToCart2= driver.findElement(By.xpath("//button[@class=\"btn btn_primary btn_small btn_inventory\"]"));
        addToCart2.click();

        MyFunc.Bekle(2);


        WebElement cartClick= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartClick.click();

        MyFunc.Bekle(2);

        WebElement checkOutClick= driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOutClick.click();

        MyFunc.Bekle(2);






        WebElement fakenameEntry= driver.findElement(By.xpath("//input[@id='first-name']"));
        fakenameEntry.sendKeys(name);

        MyFunc.Bekle(2);

        WebElement fakelastNameEntry= driver.findElement(By.xpath("//input[@id='last-name']"));
        fakelastNameEntry.sendKeys(password);

        MyFunc.Bekle(2);


        WebElement postCodeEntry= driver.findElement(By.xpath("//input[@id='postal-code']"));
        postCodeEntry.sendKeys("542541");

        MyFunc.Bekle(2);



        WebElement continueClick= driver.findElement(By.xpath("//input[@id='continue']"));
        continueClick.click();

        MyFunc.Bekle(2);


        List<WebElement> prices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));


        double sum=0;

       for (WebElement e:prices){

           System.out.println("e = " + e.getText());


           sum=sum+Double.parseDouble(e.getText().replaceAll("[^0-9,.]",""));

       }

        System.out.println("sum = " + sum);




       WebElement subTotal=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));


       Double doubleSubTotal= Double.parseDouble(subTotal.getText().replaceAll("[^0-9,.]",""));

        System.out.println("doubleSubTotal = " + doubleSubTotal);


        System.out.println("doubleSubTotal+\" = \"+ sum = " + doubleSubTotal + " = " + sum);


        Assert.assertTrue("Değerler eşleşmadi", sum==doubleSubTotal);



        BekleVeKapat();































     //   Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.




    }

}
