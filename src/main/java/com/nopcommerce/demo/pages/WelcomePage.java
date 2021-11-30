package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class WelcomePage extends Utility {
    By wellComeMessage=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkOutAsGuest=By.xpath("//button[@class=\"button-1 checkout-as-guest-button\"]");
    public void allActionPerformInWelComePage(){
        String em="Welcome, Please Sign In!";
        verifyPage(em,wellComeMessage);
        clickOnElement(checkOutAsGuest);


    }
}
