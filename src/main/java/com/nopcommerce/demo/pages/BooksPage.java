package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {
    By booksPage=By.xpath("//h1[text()='Books']");
    public String getTitleOfBooksPage(){
        return getTextFromElement(booksPage);
    }
}
