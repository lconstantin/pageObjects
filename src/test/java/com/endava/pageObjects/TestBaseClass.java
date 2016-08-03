package com.endava.pageObjects;

import com.endava.pageObjects.pageObjects.HomePage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by lconstantin on 8/1/2016.
 */
public class TestBaseClass {
    private  static WebDriver webDriver;
    protected HomePage homePage;

    @BeforeClass
    public static void setUp(){
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://endava.referrals.selectminds.com/");


    }

    @Before
    public void initPageObj() {
        homePage = PageFactory.initElements(webDriver, HomePage.class);
    }

    @AfterClass
    public static void tearDown() {
        webDriver.close();
    }
}

