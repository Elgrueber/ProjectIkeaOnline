package models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//button[@aria-labelledby='hnf-header-hamburger-label']")
    private WebElement hamburgerIcon;
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public HomePage clickHamburgerMenu() {
        click(hamburgerIcon);
        return new HomePage(getDriver());
    }
}
