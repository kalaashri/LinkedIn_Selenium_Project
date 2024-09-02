package com.LinkedIn.qa.Pages;

import com.LinkedIn.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends TestBase {

    By Logo=By.xpath("//a[@aria-label='LinkedIn']");
    By Username =By.xpath("//input[@id='username']");
    By Password =By.xpath("//input[@id='password']");
    By SignInbutton = By.xpath("//button[@type='submit']");





    public boolean LinkedInLogo()
    {
      return driver.findElement(Logo).isDisplayed();
    }
    public void Login(String Uname,String Pass)
    {
        driver.findElement(Username).sendKeys(Uname);
      driver.findElement(Password).sendKeys(Pass);
        driver.findElement(SignInbutton).click();


    }

}
