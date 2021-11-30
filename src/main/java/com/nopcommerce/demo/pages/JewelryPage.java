package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {
    By jewelryPage=By.xpath("//h1[text()='Jewelry']");
    public String getTitleOfJewelryPage(){
        return getTextFromElement(jewelryPage);
    }
}
