package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ComputerPage extends Utility {
       By computerPage=By.xpath("//h1[text()='Computers']");
       By deskTopLink=By.linkText("Desktops");
       public void clickOnDesktopLink(){
              clickOnElement(deskTopLink);
       }

       public String getTitleOfComputerPage(){
              return getTextFromElement(computerPage);
       }



}
