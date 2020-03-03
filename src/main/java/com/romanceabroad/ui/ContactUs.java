package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ContactUs extends BaseActions {


    public ContactUs(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void clickContactUsButton() {
        ajaxScroll(Locators.LINK_CONTACT_US_FORM);
        ajaxClick(Locators.LINK_CONTACT_US_FORM);
    }


    public void submitContactUsForm(String contact_us_reason,
                                    String contact_us_username,
                                    String contact_us_email,
                                    String contact_us_message,
                                    String contact_us_subject) {
        //driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        driver.findElement(Locators.CONTACT_US_DROP_DOWN_LIST_REASON).click();
        clickValueOfLists(Locators.CONTACT_US_DROP_DOWN_LIST_REASON, contact_us_reason);

        driver.findElement(Locators.CONTACT_US_FORM_USER_NAME).sendKeys(contact_us_username);

        driver.findElement(Locators.CONTACT_US_FORM_EMAIL).sendKeys(contact_us_email);

        driver.findElement(Locators.CONTACT_US_FORM_SUBJECT).sendKeys(contact_us_subject);

        driver.findElement(Locators.CONTACT_US_FORM_MESSAGE).sendKeys(contact_us_message);

        driver.findElement(Locators.CONTACT_US_BUTTON_SEND).click();

    }
}




