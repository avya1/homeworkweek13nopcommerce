package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By fn=By.xpath("//input[@id=\"BillingNewAddress_FirstName\"]");
    By ln=By.xpath("//input[@id=\"BillingNewAddress_LastName\"]");
    By eMail=By.xpath("//input[@id=\"BillingNewAddress_Email\"]");
    By country=By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]");
    By state=By.xpath("//select[@id=\"BillingNewAddress_StateProvinceId\"]");
    By city=By.xpath("//input[@id=\"BillingNewAddress_City\"]");
    By address1=By.xpath("//input[@id=\"BillingNewAddress_Address1\"]");
    By zipCode=By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]");
    By pNumber=By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]");
    By continueButton=By.xpath("//button[@name=\"save\"]/parent::div[@id=\"billing-buttons-container\"]");
    By nextDayAir=By.xpath("//input[@id=\"shippingoption_1\"]");
    By continue1=By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]");
    By creditCard=By.xpath("//input[@id=\"paymentmethod_1\"]");
    By continue2=By.xpath("//button[text()='Continue' and @name='save' and @onclick='PaymentMethod.save()']");
    By masterCard=By.xpath("//select[@id=\"CreditCardType\"]");
    By cardHolderName=By.xpath("//input[@id='CardholderName']");
    By cardNumber=By.id("CardNumber");
    By expMonth=By.id("ExpireMonth");
    By expYear=By.xpath("//select[@id='ExpireYear']");
    By cardCode=By.xpath("//input[@id='CardCode']");
    By continue3=By.xpath("//button[@onclick=\"PaymentInfo.save()\"]");
    By paymentMethod=By.xpath("//span[contains(text(),'Credit Card')]");
    By shippingMethod=By.xpath("//span[normalize-space()='Next Day Air']");
    By total=By.xpath("//span[contains(text(),'$2,950.00')]");
    By confirm=By.xpath("//button[contains(text(),'Confirm')]");
    By thankYou=By.xpath("//h1[text()='Thank you']");
    By orderPlaceSuccessFully=By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By lastContinue=By.xpath("//button[@class=\"button-1 order-completed-continue-button\"]");
    By welComeToOurStore=By.xpath("//h2[contains(text(),'Welcome to our store')]");




    public void allTheStepsPerformInCheckOutPage() throws InterruptedException {
        sendTextElement(fn,"Abhuday");
        sendTextElement(ln,"Thakur");
        RandomString randomString = new RandomString();
        String s = randomString.nextString();
        sendTextElement(eMail, s + "@gmail.com");
        selectFromDropDown(country,"27");
        clickOnElement(state);
        sendTextElement(city,"Abc");
        sendTextElement(address1,"Vaxhall");
        sendTextElement(zipCode,"39992");
        sendTextElement(pNumber,"2345678912");
        clickOnElement(continueButton);
        Thread.sleep(2000);
        clickOnElement(nextDayAir);
        clickOnElement(continue1);
        clickOnElement(creditCard);
        clickOnElement(continue2);
        Thread.sleep(3000);
        selectByVisibleTextFromDropDown(masterCard,"Master card");
        sendTextElement(cardHolderName,"Abhyuday");
        sendTextElement(cardNumber,"5412 5412 5434 5436");
        selectFromDropDown(expMonth,"7");
        selectFromDropDown(expYear,"2027");
        sendTextElement(cardCode,"307");
        clickOnElement(continue3);
        Thread.sleep(2000);
        String expRes="Credit Card";
        verifyPage(expRes,paymentMethod);
        String expRes1="Next Day Air";
        verifyPage(expRes1,shippingMethod);
        Thread.sleep(2000);
        String expRes2="$2,950.00";
        verifyPage(expRes2,total);
        clickOnElement(confirm);
        Thread.sleep(2000);
        String expRes4="Thank you";
        verifyPage(expRes4,thankYou);
        Thread.sleep(2000);
        String expRes3="Your order has been successfully processed!";
        verifyPage(expRes3,orderPlaceSuccessFully);
        Thread.sleep(2000);
        clickOnElement(lastContinue);
        Thread.sleep(2000);
        String expRes5="Welcome to our store";
        verifyPage(expRes5,welComeToOurStore);







    }
}
