package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Odev_Alpaslan extends BaseDriver {

    @Test


    public void Test6() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakealerttest = driver.findElement(By.cssSelector("#fakealerttest"));
        fakealerttest.click();

        MyFunc.Bekle(2);


        WebElement fakealert = driver.findElement(By.cssSelector("#modaldialog"));
        fakealert.click();

        MyFunc.Bekle(2);

        WebElement dialogOk = driver.findElement(By.cssSelector("#dialog-ok"));
        dialogOk.click();

        MyFunc.Bekle(2);


        BekleVeKapat();


    }

    public void Test5() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakealerttest = driver.findElement(By.cssSelector("#fakealerttest"));
        fakealerttest.click();

        MyFunc.Bekle(2);


        WebElement fakealert = driver.findElement(By.cssSelector("#fakealert"));
        fakealert.click();

        MyFunc.Bekle(2);

        WebElement dialogOk = driver.findElement(By.cssSelector("#dialog-ok"));
        dialogOk.click();

        MyFunc.Bekle(2);


        BekleVeKapat();

    }


    public void Test4() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculatetest = driver.findElement(By.cssSelector("#calculatetest"));
        calculatetest.click();

        MyFunc.Bekle(2);

        WebElement number1 = driver.findElement(By.cssSelector("#number1"));
        number1.sendKeys("158");

        MyFunc.Bekle(2);

        WebElement number2 = driver.findElement(By.cssSelector("#number2"));
        number2.sendKeys("500");

        MyFunc.Bekle(2);


        WebElement calculate = driver.findElement(By.cssSelector("#calculate"));
        calculate.click();

        MyFunc.Bekle(2);


        WebElement answer = driver.findElement(By.cssSelector("#answer"));

        System.out.println("answer.getText() = " + answer.getText());


        BekleVeKapat();

    }

    public void Test3() {

        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter = driver.findElement(By.cssSelector("#inputValEnter"));
        inputValEnter.sendKeys("teddy bear");

        MyFunc.Bekle(2);

        WebElement button = driver.findElement(By.cssSelector("button.searchformButton"));
        button.click();

        MyFunc.Bekle(2);

        WebElement searchMessageContainer = driver.findElement(By.cssSelector("#searchMessageContainer >div>span"));

        Assert.assertTrue(searchMessageContainer.getText().contains("We've got"));

        BekleVeKapat();


    }


    public void Test2() {

        driver.get("https://demo.applitools.com/");


        WebElement userName = driver.findElement(By.cssSelector("#username"));
        userName.sendKeys("ttechno@gmail.com");

        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("techno123.");

        MyFunc.Bekle(2);

        WebElement logIn = driver.findElement(By.cssSelector("#log-in"));
        logIn.click();

        MyFunc.Bekle(2);

        WebElement TextControl = driver.findElement(By.cssSelector("#time"));


        Assert.assertTrue(TextControl.getText().contains("Your nearest branch closes in: 30m 5s"));

    }


    public void Test1() {
        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.cssSelector("#userName"));
        fullName.sendKeys("Automation");

        MyFunc.Bekle(2);

        WebElement userEmailName = driver.findElement(By.cssSelector("#userEmail"));
        userEmailName.sendKeys("Testing@gmail.com");

        MyFunc.Bekle(2);

        WebElement currentAddress = driver.findElement(By.cssSelector("#currentAddress"));
        currentAddress.sendKeys("Testing Current Address");

        MyFunc.Bekle(2);

        WebElement permanentAddress = driver.findElement(By.cssSelector("#permanentAddress"));
        permanentAddress.sendKeys("Testing Permanent Address");

        MyFunc.Bekle(2);

        WebElement submit = driver.findElement(By.cssSelector("#submit"));
        submit.click();

        MyFunc.Bekle(2);


        WebElement checkName = driver.findElement(By.cssSelector("#name"));
        Assert.assertTrue(checkName.getText().contains("Automation"));

        WebElement checkEmail = driver.findElement(By.cssSelector("#email"));
        Assert.assertTrue(checkEmail.getText().contains("Testing@gmail.com"));


        BekleVeKapat();


    }


}
