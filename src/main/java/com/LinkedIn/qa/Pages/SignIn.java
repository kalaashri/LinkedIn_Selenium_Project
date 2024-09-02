package com.LinkedIn.qa.Pages;

import com.LinkedIn.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn extends TestBase {



    By SignIn =By.xpath("//div[contains(@class,'nav__cta-container')]/a[2]");




    public  void ClickSignIn()

    {
        driver.findElement(SignIn).click();



    }

}
