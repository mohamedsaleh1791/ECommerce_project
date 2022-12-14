package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import POM.LoginPage;



public class ChromeBrowser {
    WebDriver driver = null;

    @BeforeMethod
    public void setup() throws InterruptedException {
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\TestingAutomation\\Testing\\src\\resources\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.noon.com/egypt-en/");
        Thread.sleep(300);
    }
    @Test
    public void loginWithValidData() throws InterruptedException {
        LoginPage loginPage=new LoginPage();
        loginPage.signinBTN(driver).click();
        loginPage.emailField(driver).sendKeys("qququju579@tmail3.com");
        loginPage.passwordField(driver).sendKeys("Ms@12345");
        loginPage.loginBTN(driver).click();
        Thread.sleep(10000);//using long time due to low performance of website
        Assert.assertTrue(loginPage.wishListLink(driver).getText().contains("Wishlist"));
    }
    @Test
    public void loginWithInValidData() throws InterruptedException {
        LoginPage loginPage=new LoginPage();
        loginPage.signinBTN(driver).click();
        loginPage.emailField(driver).sendKeys("Test");
        loginPage.passwordField(driver).sendKeys("12345");
        loginPage.loginBTN(driver).click();
        Thread.sleep(10000);//using long time due to low performance of website
//        Assert.assertTrue(loginPage.wishListLink(driver).getText().contains("Wishlist"));
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }
}
