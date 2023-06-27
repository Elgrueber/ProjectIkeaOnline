package tests;

import base.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import models.*;

import java.util.List;

public class testFindSamples extends BaseTest {


    @Test
    public void testFindSample() {
        HomePage homePage = new HomePage(getDriver())
                .clickHamburgerMenu();
    }

    @Ignore
    @Test
    public void testFindSampleBed() {
        final String productBedMalma = "High bed frame/2 storage boxes, black-brown/Luröy,";
        MainPage mainPage = openBaseURL()
                .clickOnFurnitureFromProduct()
                .clickOnBed()
                .clickOnBedWithStorage()
                .clickOnBedMalma();

        MalmBedPage malmBedPage = new MalmBedPage(getDriver());
        Assert.assertEquals(malmBedPage.getTextMessage(), productBedMalma);
    }
}

