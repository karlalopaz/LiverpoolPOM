package com.liverpool.tests;

import com.liverpool.pages.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public SearchPage search;
    public ResultsPage results;
    public ProductPage product;
    public CartPage cart;

    @Before
    public void before () {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        search = new SearchPage(driver);
        results = new ResultsPage(driver);
        product = new ProductPage(driver);
        cart = new CartPage(driver);
    }

    @After
    public void after () {
        driver.quit();
    }
}
