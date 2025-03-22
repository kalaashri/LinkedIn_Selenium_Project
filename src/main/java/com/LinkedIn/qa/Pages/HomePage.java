package com.LinkedIn.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.LinkedIn.qa.base.BasePage;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By logo=By.xpath("//a[@aria-label='LinkedIn']");

    public HomePage logo(String logoText){
        setText(logo, logoText);
        return this;
    }
}
