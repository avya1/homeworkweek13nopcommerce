package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase {
    DesktopsPage desktopsPage = new DesktopsPage();
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    BuildYourOwnComputer buildYourOwnComputer=new BuildYourOwnComputer();
    ShoppingCart shoppingCart=new ShoppingCart();
    WelcomePage welcomePage=new WelcomePage();
    CheckOutPage checkOutPage=new CheckOutPage();



    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        homePage.clickOnComputerLink();
        computerPage.clickOnDesktopLink();
        desktopsPage.selectPositionZToA();
        productsCompareAndSortList("Name:ZtoA");
    }
    @Test
    public void  verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputerLink();
        computerPage.clickOnDesktopLink();
        desktopsPage.selectPositionAToZ();
        Thread.sleep(3000);
        desktopsPage.clickOnAddToCartButton();
        buildYourOwnComputer.allActionsPerformInBuildYourOwnComputerPage();
        shoppingCart.allActionPerformInShoppingCartPage();
        welcomePage.allActionPerformInWelComePage();
        checkOutPage.allTheStepsPerformInCheckOutPage();

    }

}