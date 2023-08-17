package Denemeler;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Deneme {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", " C:\\Users\\Casper Excalibur\\Documents\\firefox.exe");

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");

        WebDriver driver = new FirefoxDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.miamistonezone.com/shop-all?page=2");

        List<WebElement> productElements = driver.findElements(By.cssSelector("sEklKbV"));

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Product Data");

        int rowNum = 0;
        for (WebElement productElement : productElements) {
            productElement.click();  // Ürüne tıkla

            // Ürün detay sayfasından bilgileri al
            String productName = driver.findElement(By.cssSelector("_2qrJF")).getText();
            String productDescription = driver.findElement(By.cssSelector(".product-description")).getText();
            String productImageURL = driver.findElement(By.cssSelector("_3ggop")).getAttribute("src");

            // Excel'e ekle
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(productName);
            row.createCell(1).setCellValue(productDescription);
            row.createCell(2).setCellValue(productImageURL);

            driver.navigate().back();  // Ana sayfaya geri dön
            productElements = driver.findElements(By.cssSelector("sEklKbV"));  // Ürünleri tekrar listeleyin
        }

        try (FileOutputStream fileOut = new FileOutputStream("product_data.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
