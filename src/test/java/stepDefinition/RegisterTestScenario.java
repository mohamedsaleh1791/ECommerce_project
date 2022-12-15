package stepDefinition;

import Pages.LoginPage;
import Pages.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegisterTestScenario {
    WebDriver driver = null;
    LoginPage loginPage=null;
    RegisterPage registerPage=null;


    public void setup() throws InterruptedException {
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\TestingAutomation\\Testing\\src\\resources\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.noon.com/egypt-en/");
        Thread.sleep(300);
    }

    public void registerWithValidData() throws InterruptedException {
        loginPage=new LoginPage();
        registerPage=new RegisterPage();
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
        Assert.assertTrue(loginPage.logoutLink(driver).getText().contains("Wishlist"));
    }



    public void closeDriver(){
        driver.quit();
    }
}
