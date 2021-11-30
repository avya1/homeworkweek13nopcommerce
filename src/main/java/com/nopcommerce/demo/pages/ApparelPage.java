package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By apparelPage=By.xpath("//h1[text()='Apparel']");
    public String getTitleOfApparelPage(){
        return getTextFromElement(apparelPage);
    }
}
