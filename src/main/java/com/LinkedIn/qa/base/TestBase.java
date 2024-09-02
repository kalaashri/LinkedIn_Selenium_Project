package com.LinkedIn.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public TestBase()
    {
        try {
            prop=new Properties();
            FileInputStream ip=new FileInputStream("C:/Users/shanm/IdeaProjects/Selenium/src/main/java/com/LinkedIn/qa/config/Config.properties");
            prop.load(ip);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void initialization(String browser)
    {


        if(browser.equals("chrome"))
        {
            System.setProperty("Webdriver.chrome.driver", "D://ECLIPSE//selenium-java-4.11.0//chromedriver.exe");
            driver= new ChromeDriver();
        }
        else if(browser.equals("firefox"))
        {
            System.setProperty("webdriver.firefox.marionette", "D://ECLIPSE//selenium-java-4.11.0//geckodriver");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url"));

 
        }}

