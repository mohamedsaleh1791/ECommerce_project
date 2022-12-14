package org.example;

import POM.LoginPage;
import POM.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class RegisterTestScenario {
    WebDriver driver = null;

    @BeforeTest
    public void setup() throws InterruptedException {
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\TestingAutomation\\Testing\\src\\resources\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.noon.com/egypt-en/");
        Thread.sleep(300);
    }
    @Test
    public void registerWithValidData() throws InterruptedException {
        LoginPage loginPage=new LoginPage();
        RegisterPage registerPage=new RegisterPage();
        loginPage.signinBTN(driver).click();
        Thread.sleep(10000);
        registerPage.signUpBTN(driver).click();
        Thread.sleep(10000);
        registerPage.emailIP(driver).sendKeys("test1@winji.com");
        registerPage.passwordIP(driver).sendKeys("Test@12345");
        registerPage.firstNameIP(driver).sendKeys("Ali");
        registerPage.lastNameIP(driver).sendKeys("ali");
        registerPage.createAccount(driver).click();
        Thread.sleep(10000);//using long time due to low performance of website
        Assert.assertTrue(loginPage.wishListLink(driver).getText().contains("Wishlist"));
    }


    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
}
