package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_OpeningWebsite_Alpaslan {
    public static void main(String[] args) {

        WebDriver driver1=new ChromeDriver();
      //  WebDriver driver2=new FirefoxDriver();
      //  WebDriver driver3=new EdgeDriver();


        driver1.get("https://www.stepstone.de/jobs/java-tester?action=facet_selected%3bskills%3b673826&fsk=673826");


        MyFunc.Bekle(5);

        driver1.quit();

    }
}
