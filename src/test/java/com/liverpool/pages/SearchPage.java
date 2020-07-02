package com.liverpool.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public SearchPage(WebDriver we) {
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className=".o-header")
    WebElement logoLiverpool;
    @FindBy(className=".input-group")
    WebElement campoBusqueda;
    @FindBy(className=".icon-zoom")
    WebElement iconoBusqueda;

    public void navegar(String url) {
        driver.get(url);

    }
}
