package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class ChromeBrowser {
    WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\TestingAutomation\\Testing\\src\\resources\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.noon.com/egypt-en/");
        Thread.sleep(300);
    }
    @Test
    public void validData() {
        driver.findElement(By.id("dd_header_signInOrUp")).click();
        driver.findElement(By.id("emailInput")).sendKeys("xyz");
    }
    @Test
    public void inValidData() {

        driver.findElement(By.id("dd_header_signInOrUp")).click();
        driver.findElement(By.id("emailInput")).sendKeys("xyz");
    }
    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
}
