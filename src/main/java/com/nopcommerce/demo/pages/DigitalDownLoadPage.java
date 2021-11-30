package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DigitalDownLoadPage extends Utility {
    By digitalDownloadPage=By.xpath("//h1[text()='Digital downloads']");
    public String getTitleOfDigitalDownloadPage(){
        return getTextFromElement(digitalDownloadPage);
    }
}
