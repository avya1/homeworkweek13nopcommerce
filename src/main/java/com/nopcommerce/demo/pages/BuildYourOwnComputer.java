package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer  extends Utility {
    By verifyBYOC=By.xpath("//h1[text()='Build your own computer']");
    By ghzIntelPremium=By.id("product_attribute_1");
    By selectRam=By.xpath("//select[@id=\"product_attribute_2\"]");
    By hdd=By.xpath("//input[@id='product_attribute_3_7']");
    By oS=By.xpath("//input[@id='product_attribute_4_9']");
    By software=By.xpath("//input[@id=\"product_attribute_5_12\"]");
    By price1475=By.id("price-value-1");
    //By addToCart=By.id("add-to-cart-button-1");
    By addToCart=By.xpath("//button[@id='add-to-cart-button-1']");
    By productAddedMessage= By.xpath("//p[@class='content']");
    By crossSign=By.xpath("//span[@class=\"close\"]");
    By shoppingCart=By.xpath("//span[@class=\"cart-label\"]");
    By goToCart=By.xpath("//button[contains(text(),'Go to cart')]");







    public void allActionsPerformInBuildYourOwnComputerPage() throws InterruptedException {
        String em="Build your own computer";
        verifyPage(em,verifyBYOC);
        selectFromDropDown(ghzIntelPremium,"1");
        selectFromDropDown(selectRam,"5");
        Thread.sleep(2000);
        clickOnElement(hdd);
        clickOnElement(oS);
        Thread.sleep(3000);
        clickOnElement(software);
        Thread.sleep(3000);
        String em1="$1,475.00";
        verifyPage(em1,price1475);
        Thread.sleep(3000);
        clickOnElement(addToCart);
        Thread.sleep(2000);
        String em2="The product has been added to your shopping cart";
        verifyPage(em2,productAddedMessage);
        Thread.sleep(2000);
        clickOnElement(crossSign);
        Thread.sleep(2000);
        mHoverAndClick(shoppingCart,goToCart);







    }


}
