package com.LinkedIn.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    protected BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void setText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    
}
