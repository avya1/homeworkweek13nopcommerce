package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {
    By shoppingCartMessage=By.xpath("//h1[text()='Shopping cart']");
    By quantity=By.xpath("//input[@class=\"qty-input\"]");
    By updateShoppingCart=By.xpath("//button[@class=\"button-2 update-cart-button\"]");
    By verifyTotal2950=By.xpath("//span[@class=\"product-subtotal\"]");
    By agreeCheckBox=By.xpath("//input[@id=\"termsofservice\"]");
    By checkOut=By.xpath("//button[@id=\"checkout\"]");



    public void allActionPerformInShoppingCartPage(){
        String em="Shopping cart";
        verifyPage(em,shoppingCartMessage);
        doubleClickOnElement(quantity);
        sendTextElement(quantity,"2");
        clickOnElement(updateShoppingCart);
        String em1="$2,950.00";
        verifyPage(em1,verifyTotal2950);
        clickOnElement(agreeCheckBox);
        clickOnElement(checkOut);





    }

}
