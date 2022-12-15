package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import POM.LoginPage;



public class LoginTestScenario {
    WebDriver driver = null;
    LoginPage loginPage=null;

    @BeforeTest
    public void setup() throws InterruptedException {
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\TestingAutomation\\Testing\\src\\resources\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.noon.com/egypt-en/");
        Thread.sleep(300);
    }
    @Test
    public void loginWithValidData() throws InterruptedException {
        loginPage=new LoginPage();
        loginPage.signinBTN(driver).click();
        loginPage.emailField(driver).sendKeys("qququju579@tmail3.com");
        loginPage.passwordField(driver).sendKeys("Ms@12345");
        loginPage.loginBTN(driver).click();
        Thread.sleep(20000);//using long time due to low performance of website
        Assert.assertTrue(loginPage.wishListLink(driver).getText().contains("Wishlist"));
    }


    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
}
