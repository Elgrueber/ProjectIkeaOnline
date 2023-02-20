package models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class BaseHeaderPage extends BasePage  {

    public BaseHeaderPage(WebDriver driver) {
        super(driver);
    }

}
