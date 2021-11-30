package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {
    By giftCardPage=By.xpath("//h1[text()='Gift Cards']");
    public String getTitleOfGiftCardPage(){
        return getTextFromElement(giftCardPage);
    }
}
