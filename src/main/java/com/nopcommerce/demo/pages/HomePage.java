package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By computerLink=By.linkText("Computers");
    By electronicsLink=By.linkText("Electronics");
    By apparelLink=By.linkText("Apparel");
    By digitalDownloadLink=By.linkText("Digital downloads");
    By booksLink=By.linkText("Books");
    By jewelryLink=By.linkText("Jewelry");
    By giftCardsLink=By.linkText("Gift Cards");
    By desktopsLink=By.linkText("Desktops ");
    public void clickOnComputerLink(){clickOnElement(computerLink);}
    public void clickOnElectronicsLink(){
        clickOnElement(electronicsLink);
    }
    public void clickOnApparelLink(){
        clickOnElement(apparelLink);
    }
    public void clickOnDigitalDownLoadLink(){
        clickOnElement(digitalDownloadLink);
    }
    public void clickOnBooksLink(){
        clickOnElement(booksLink);
    }
    public void clickOnJewelryLink(){
        clickOnElement(jewelryLink);
    }
    public void clickOnGiftCardsLink(){
        clickOnElement(giftCardsLink);
    }
    public void clickOnDesktopLink(){
        clickOnElement(desktopsLink);
    }




}
