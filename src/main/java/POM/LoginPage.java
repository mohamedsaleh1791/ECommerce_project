package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    public WebElement signinBTN(WebDriver driver){
        By signInLoc= By.id("dd_header_signInOrUp");
        WebElement signInElement= driver.findElement(signInLoc);
        return signInElement;
    }
    public WebElement emailField(WebDriver driver){
        By emailLOC= By.id("emailInput");
        WebElement emailElement= driver.findElement(emailLOC);
        return emailElement;
    }
    public WebElement passwordField(WebDriver driver){
        By passwordLOC= By.id("passwordInput");
        WebElement passwordElement= driver.findElement(passwordLOC);
        return passwordElement;
    }
    public WebElement loginBTN(WebDriver driver){
        By loginLOC= By.id("login-submit");
        WebElement loginElement= driver.findElement(loginLOC);
        return loginElement;
    }
    public WebElement wishListLink(WebDriver driver){
        By wishListLOC= By.className("wishlistLink");
        WebElement wishListElement= driver.findElement(wishListLOC);
        return wishListElement;
    }
}
