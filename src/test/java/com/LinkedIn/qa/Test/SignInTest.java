package com.LinkedIn.qa.Test;


import com.LinkedIn.qa.Pages.LoginPage;
import com.LinkedIn.qa.Pages.SignIn;
import com.LinkedIn.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends TestBase {


SignIn sp;

public SignInTest()
{
    super();
}

@BeforeMethod
public void SetUp()
{
    initialization("chrome");
    sp=new SignIn();

}
@Test
public void ClickonSignIn()
{
    sp.ClickSignIn();
    String actTitle=driver.getTitle();
    System.out.println(actTitle);
    Assert.assertEquals(actTitle,"LinkedIn Login, Sign in | LinkedIn");
}
}
