package com.LinkedIn.qa.Test;


import com.LinkedIn.qa.Pages.LoginPage;

import com.LinkedIn.qa.Pages.SignIn;
import com.LinkedIn.qa.base.TestBase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage lp;
    SignIn sp1;

    public LoginPageTest()
    {
        super();
    }

    @BeforeMethod
    public void SetUp()
    {
        initialization("chrome");
        lp=new LoginPage();
        sp1=new SignIn();
        sp1.ClickSignIn();
    }
@Test(priority = 0)
public void Logo()
{
    boolean ans=lp.LinkedInLogo();
    Assert.assertTrue(ans);
}
@Test (priority = 1)
 public void Loginverification()
{
lp.Login(prop.getProperty("username1"), prop.getProperty("password") );
String acttitle= driver.getTitle();
Assert.assertEquals("Feed | LinkedIn",acttitle);

}
/*@BeforeMethod
    public void Teardown()
{
    driver.quit();
}*/


}
