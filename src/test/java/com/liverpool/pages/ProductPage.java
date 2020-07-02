package com.liverpool.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public ProductPage(WebDriver we) {
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    WebElement nombreArticulo;
    WebElement precioAlto;
    WebElement tamanoArticulo;
    WebElement botonAgregarBolsa;
}
