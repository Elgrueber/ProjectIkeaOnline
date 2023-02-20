package tests;

import base.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import models.*;

import java.util.List;

public class testFindSamples extends BaseTest {


        @Test
        public void testFindSample() {
            HomePage homePage = new HomePage(getDriver())
                    .clickHamburgerMenu();
            }
        }


