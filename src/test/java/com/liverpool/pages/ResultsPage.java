package com.liverpool.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultsPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public ResultsPage(WebDriver we) {
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    WebElement listaArticulos;
    WebElement mosaicoArticulo;
    WebElement nombreArticulo;
    WebElement precioAlto;
}
