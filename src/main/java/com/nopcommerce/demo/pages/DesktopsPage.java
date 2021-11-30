package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility  {
   By addToCart=By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
    By positionDropDown =By.xpath("//select[@id='products-orderby']");
    public void selectPositionZToA() throws InterruptedException {
        clickOnElement(positionDropDown);
        Thread.sleep(3000);
        selectFromDropDown(positionDropDown,"6");
    }
    public void selectPositionAToZ(){
        clickOnElement(positionDropDown);
        selectFromDropDown(positionDropDown,"5");
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCart);
    }

}
