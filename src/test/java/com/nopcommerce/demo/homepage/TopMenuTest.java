package com.nopcommerce.demo.homepage;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
HomePage homePage=new HomePage();
ComputerPage computerPage=new ComputerPage();
ElectronicsPage electronicsPage=new ElectronicsPage();
DigitalDownLoadPage digitalDownLoadPage=new DigitalDownLoadPage();
GiftCardsPage giftCardsPage=new GiftCardsPage();
BooksPage booksPage=new BooksPage();
ApparelPage apparelPage=new ApparelPage();
JewelryPage jewelryPage=new JewelryPage();
@Test
public void userShouldClickOnComputerLinkAndNavigateToComputerPage(){
    homePage.clickOnComputerLink();
    String expectedResult="Computers";
    String actualMessage=computerPage.getTitleOfComputerPage();
    Assert.assertEquals(expectedResult,actualMessage,"User is not navigated to computerPage");

}
@Test
public void userShouldClickOnElectronicsLinkAndNavigateToElectronicPage(){
    homePage.clickOnElectronicsLink();
    String expectedResult="Electronics";
    String actualMessage=electronicsPage.getTitleOfElectronicsPage();
    Assert.assertEquals(expectedResult,actualMessage,"User is not navigated to Electronic Page");

}
    @Test
    public void userShouldClickOnApparelLinkAndNavigateToApparelPage(){
        homePage.clickOnApparelLink();
        String expectedResult="Apparel";
        String actualMessage=apparelPage.getTitleOfApparelPage();
        Assert.assertEquals(expectedResult,actualMessage,"User is not navigated to Apparel Page");

    }
    @Test
    public void userShouldClickOnDigitalDownloadsLinkAndNavigateToDigitalDownloadsPage(){
        homePage.clickOnDigitalDownLoadLink();
        String expectedResult="Digital downloads";
        String actualMessage=digitalDownLoadPage.getTitleOfDigitalDownloadPage();
        Assert.assertEquals(expectedResult,actualMessage,"User is not navigated to Digital Downloads Page");

    }
    @Test
    public void userShouldClickOnLinkBooksAndNavigateToBooksPage(){
        homePage.clickOnBooksLink();
        String expectedResult="Books";
        String actualMessage=booksPage.getTitleOfBooksPage();
        Assert.assertEquals(expectedResult,actualMessage,"User is not navigated to books Page");

    }
    @Test
    public void userShouldClickOnJewelryAndNavigateToJewelryPage(){
        homePage.clickOnJewelryLink();
        String expectedResult="Jewelry";
        String actualMessage=jewelryPage.getTitleOfJewelryPage();
        Assert.assertEquals(expectedResult,actualMessage,"User is not navigated to jewelry Page");

    }
    @Test
    public void userShouldClickOnGiftCardsAndNavigateToGiftCardsPage(){
        homePage.clickOnGiftCardsLink();
        String expectedResult="Gift Cards";
        String actualMessage=giftCardsPage.getTitleOfGiftCardPage();
        Assert.assertEquals(expectedResult,actualMessage,"User is not navigated to giftCard Page");

    }








}
