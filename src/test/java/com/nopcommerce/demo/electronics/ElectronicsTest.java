package com.nopcommerce.demo.electronics;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage homePage=new HomePage();
    ElectronicsPage electronicsPage=new ElectronicsPage();
    @Test
public void verifyUserShouldNavigateToCellPhonePageSuccessFully(){
      electronicsPage.mouseHoverOnElectronicsLinkAndClickOnCellPhoneLink();
      electronicsPage.verifyCellPhonePage();

}
@Test
    public void VerifyThatProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
    electronicsPage.mouseHoverOnElectronicsLinkAndClickOnCellPhoneLink();
    electronicsPage.verifyCellPhonePage();
    electronicsPage.clickOnListViewTabAndSelectItemVerifyTextAndPrice();
    Thread.sleep(2000);
    electronicsPage.changeQuantityAndAddToCartAndVerifyMessage();




}

}
