package com.sinensia.hellotestrobobar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://www.jetbrains.com/
public class RobobarCart {
    @FindBy(css = "a.wt-button_mode_primary")
    public WebElement seeAllToolsButton;

    @FindBy(xpath = "//div[contains(@class, 'menu-main__item') and text() = 'Developer Tools']")
    public WebElement toolsMenu;

    @FindBy(css = "[data-test='menu-main-icon-search']")
    public WebElement searchButton;

    public RobobarCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}