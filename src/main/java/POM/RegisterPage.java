package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    public WebElement signUpBTN(WebDriver driver){
        By signUpLOC= By.className("sc-58e23d11-7");
        WebElement signUpElement= driver.findElement(signUpLOC);
        return signUpElement;
    }
    public WebElement emailIP(WebDriver driver){
        By emailLOC= By.id("emailInput");
        WebElement emailElement= driver.findElement(emailLOC);
        return emailElement;
    }
    public WebElement passwordIP(WebDriver driver){
        By passwordLOC= By.id("passwordInput");
        WebElement passwordElement= driver.findElement(passwordLOC);
        return passwordElement;
    }
    public WebElement firstNameIP(WebDriver driver){
        By firstNameLOC= By.id("firstNameInput");
        WebElement firstNameElement= driver.findElement(firstNameLOC);
        return firstNameElement;
    }
    public WebElement lastNameIP(WebDriver driver){
        By lastNameLOC= By.id("lastNameInput");
        WebElement lastNameElement= driver.findElement(lastNameLOC);
        return lastNameElement;
    }

    public WebElement createAccount(WebDriver driver){
        By createAccountLOC= By.id("login-submit");
        WebElement createAccountElement= driver.findElement(createAccountLOC);
        return createAccountElement;
    }

}
