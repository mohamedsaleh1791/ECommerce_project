package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class App 
{

    @Test
    public void validData(){
        System.setProperty("webdriver.gecko.driver","D:\\TestingAutomation\\Testing\\src\\resources\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");

    }



}

