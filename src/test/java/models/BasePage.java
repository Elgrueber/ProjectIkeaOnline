package models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    protected WebDriver getDriver() {
        return driver;
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected WebDriverWait getWait10() {
        if (wait == null) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
        return wait;
    }

    protected Actions getActions() {
        if (actions == null) {
            actions = new Actions(driver);
        }
        return actions;
    }
    public void wait10ElementToBeVisible(WebElement element) {
        getWait10().until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement wait10ElementToBeClickable(WebElement element) {
        return getWait10().until(ExpectedConditions.elementToBeClickable(element));
    }
    protected void click(WebElement element) {
        element.click();
    }
    protected String getText(WebElement element) {
        if (!element.getText().isEmpty()) {
            wait10ElementToBeVisible(element);
        }
        return element.getText();
    }

}
