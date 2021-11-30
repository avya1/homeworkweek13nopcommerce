package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import net.bytebuddy.utility.RandomString;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.security.SecureRandom;

public class ElectronicsPage extends Utility {
    By electronicsPage=By.xpath("//h1[text()='Electronics']");
    By electronicsLink=By.linkText("Electronics");
    By cellPhoneLink=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By listViewTab=By.xpath("//a[@class=\"viewmode-icon list\"]");
    By nokiaLink=By.xpath("//h2[@class=\"product-title\"]//a[text()='Nokia Lumia 1020']");
    By verify698=By.xpath("//span[@class='product-subtotal']");
    By checkBoxIAgree=By.xpath("//input[@id='termsofservice']");
    By checkout=By.xpath("//button[@id='checkout']");
    By verifyWellComeMsg=By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By clickOnRegister=By.xpath("//button[@class=\"button-1 register-button\"]");
    By verifyRegister=By.xpath("//h1[text()='Register']");
    By firstName=By.xpath("//input[@id=\"FirstName\"]");
    By lastName=By.xpath("//input[@id=\"LastName\"]");
    By email=By.xpath("//input[@id=\"Email\"]");
    By password=By.xpath("//input[@id=\"Password\"]");
    By confirmPassword=By.xpath("//input[@id=\"ConfirmPassword\"]");
    By register=By.xpath("//button[@id='register-button']");
    By getVerifyRegister1=By.xpath("//div[text()='Your registration completed']");
    By clickOnContinue=By.xpath("//a[@class='button-1 register-continue-button']");
    By verifyShoppingCard=By.xpath("//h1[text()='Shopping cart']");
    By checkBoxIAgreeWithTerm=By.xpath("//input[@id=\"termsofservice\"]");
    By checkOut=By.xpath("//button[@id=\"checkout\"]");
    By fn=By.xpath("//input[@id=\"BillingNewAddress_FirstName\"]");
    By ln=By.xpath("//input[@id=\"BillingNewAddress_LastName\"]");
    By mail=By.xpath("//input[@id=\"BillingNewAddress_Email\"]");
    By country=By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]");
    By state=By.xpath("//select[@id=\"BillingNewAddress_StateProvinceId\"]");
    By city=By.xpath("//input[@id=\"BillingNewAddress_City\"]");
    By address1=By.xpath("//input[@id=\"BillingNewAddress_Address1\"]");
    By postalCode=By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]");
    By pNumber=By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]");
    By continueButton=By.xpath("//button[@onclick=\"Billing.save()\"]");
    By twoDayAir=By.xpath("//input[@id=\"shippingoption_2\"]");
    By continue1=By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]");
    By creditCard=By.xpath("//input[@id=\"paymentmethod_1\"]");
    By continue2=By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]");
    By cardHolderName=By.xpath("//input[@id=\"CardholderName\"]");
    By cardNumber=By.xpath("//input[@id=\"CardNumber\"]");
    By expMonth=By.xpath("//select[@id=\"ExpireMonth\"]");
    By expYear=By.xpath("//select[@id=\"ExpireYear\"]");
    By cardCod=By.xpath("//input[@id=\"CardCode\"]");
    By continue3=By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]");
    By verifyPaymentMethod=By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyShippingMethod=By.xpath("//span[normalize-space()='2nd Day Air']");
    By verifyTotal= By.xpath("//span[@class=\"product-subtotal\"]");
    By confirm=By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]");
    By verifyThankYou=By.xpath("//h1[text()='Thank you']");
    By verifyOrderSuccessfullyPlaced=By.xpath("//strong[text()='Your order has been successfully processed!']");
    By continue4=By.xpath("//button[@class=\"button-1 order-completed-continue-button\"]");
    By wellComeToOurStore=By.xpath("//h2[text()='Welcome to our store']");
    By logOutLink=By.xpath("//a[@class=\"ico-logout\"]");










    public String getTitleOfElectronicsPage(){
        return getTextFromElement(electronicsPage);
    }
   public void mouseHoverOnElectronicsLinkAndClickOnCellPhoneLink(){
    mHoverAndClick(electronicsLink,cellPhoneLink);

   }
   public void verifyCellPhonePage(){
      String expectedResult="Cell phones";
      verifyPage(expectedResult,By.xpath("//h1[text()='Cell phones']"));
   }
  public void clickOnListViewTabAndSelectItemVerifyTextAndPrice() throws InterruptedException {
        clickOnElement(listViewTab);
        Thread.sleep(3000);
        clickOnElement(nokiaLink);
        String expectedResult="Nokia Lumia 1020";
        verifyPage(expectedResult,By.xpath("//h1[text()='Nokia Lumia 1020']"));
        String expectedResult1="$349.00";
        verifyPage(expectedResult1,By.xpath("//span[@id='price-value-20']"));
    }
    public void changeQuantityAndAddToCartAndVerifyMessage() throws InterruptedException {
        doubleClickOnElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        Thread.sleep(2000);
        sendTextElement(By.xpath("//input[@id='product_enteredQuantity_20']"),"2");
        clickOnElement(By.xpath("//button[@id=\"add-to-cart-button-20\"]"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//span[@class='close'] "));
        Thread.sleep(2000);
        mHoverAndClick((By.xpath("//span[text()='Shopping cart']")),(By.xpath("//button[@class='button-1 cart-button']")));
        String expectedResult = "Shopping cart";
        Thread.sleep(3000);
        verifyPage(expectedResult, By.xpath("//h1[text()='Shopping cart']"));
        String expQty = "2";
        String actualQty = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).getAttribute("value");
        Thread.sleep(5000);
        Assert.assertEquals(expQty, actualQty);
        String em="$698.00";
        verifyPage(em,verify698);
        clickOnElement(checkBoxIAgree);
        clickOnElement(checkout);
        String expMsg="Welcome, Please Sign In!";
        verifyPage(expMsg,verifyWellComeMsg);
        clickOnElement(clickOnRegister);
        String expRslt="Register";
        verifyPage(expRslt,verifyRegister);
        sendTextElement(firstName,"james");
        sendTextElement(lastName,"oare");
        RandomString randomString = new RandomString();
        String s = randomString.nextString();
        sendTextElement(email, s + "@gmail.com");
        sendTextElement(password,"klm123");
        sendTextElement(confirmPassword,"klm123");
        clickOnElement(register);
        Thread.sleep(2000);
        String em2="Your registration completed";
        verifyPage(em2,getVerifyRegister1);
        clickOnElement(clickOnContinue);
        String em3="Shopping cart";
        verifyPage(em3,verifyShoppingCard);
        clickOnElement(checkBoxIAgreeWithTerm);
        clickOnElement(checkOut);
        Thread.sleep(2000);
        sendTextElement(fn,"sagar");
        sendTextElement(ln,"sharma");
        driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_Email\"]")).clear();
        RandomString randomString1 = new RandomString();
        String s1 = randomString1.nextString();
        sendTextElement(mail,s1 + "@gmail.com");
        selectFromDropDown(country,"1");
        selectFromDropDown(state, "1");
        sendTextElement(city,"Bilaspur");
        sendTextElement(address1,"Tilak Nagar");
        sendTextElement(postalCode,"4003");
        sendTextElement(pNumber,"982798463748");
        clickOnElement(continueButton);
        clickOnElement(twoDayAir);
        clickOnElement(continue1);
        clickOnElement(creditCard);
        clickOnElement(continue2);
        sendTextElement(cardHolderName,"Aavya");
        sendTextElement(cardNumber,"4658 5987 2846 6012");
        selectFromDropDown(expMonth,"3");
        sendTextElement(expYear,"2027");
        sendTextElement(cardCod,"307");
        Thread.sleep(3000);
        clickOnElement(continue3);
        String em4="Credit Card";
        verifyPage(em4,verifyPaymentMethod);
        String em5="2nd Day Air";
        verifyPage(em5,verifyShippingMethod);
        Thread.sleep(3000);
        String em6="$698.00";
        verifyPage(em6,verifyTotal);
        clickOnElement(confirm);
        String em7="Thank you";
        verifyPage(em7,verifyThankYou);
        String em8="Your order has been successfully processed!";
        verifyPage(em8,verifyOrderSuccessfullyPlaced);
        clickOnElement(continue4);
        Thread.sleep(3000);
        String em9="Welcome to our store";
        verifyPage(em9,wellComeToOurStore);
        clickOnElement(logOutLink);
        String url = driver.getCurrentUrl();
        Assert.assertEquals( url, "https://demo.nopcommerce.com/");



























    }

}
