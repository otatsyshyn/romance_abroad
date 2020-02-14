package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

public void clickJoinButton(){
    driver.findElement(Locators.BUTTON_REGISTRATION).click();
}

    public void javaWait(int ms) {
        System.out.println("Child!!!");
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


public void clickMainPage(){
        driver.findElement(Locators.LINK_MEDIA).click();
    }

public String getMainPageTabs () {
        String text = driver.findElement(Locators.MAIN_PAGE_TABS).getText();
        return text;
    }


public void completeFirstPartOfRegistration(String email, String password) {
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email);
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
    driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(password);

   }
public void clickNextButton() {
    wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
    driver.findElement(Locators.BUTTON_NEXT).click();
    }

public void completeSecondPartOfRegistration(String nickname, String phone,
                                             String  month, String day, String year,
                                             String city, String location){
    driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
    driver.findElement(Locators.BUTTON_NEXT).click();
    driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(nickname);

    driver.findElement(Locators.DROP_DOWN_LIST_SELECT_DAY).click();
    clickValueOfLists(Locators.DROP_DOWN_LIST_SELECT_VALUE_DAY, day);

    driver.findElement(Locators.DROP_DOWN_LIST_SELECT_MONTH).click();
    clickValueOfLists(Locators.DROP_DOWN_LIST_SELECT_VALUE_MONTH, month);

    driver.findElement(Locators.DROP_DOWN_LIST_SELECT_YEAR).click();
    clickValueOfLists(Locators.DROP_DOWN_LIST_SELECT_VALUE_YEAR,year);

    driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(phone);
    driver.findElement(Locators.CHECKBOX_CONFIRMATION).click();

    driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).clear();
    driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).sendKeys(city);
    clickValueOfLists(Locators.DROP_DOWN_LIST_VALUE_LOCATION, location);
    }

    public  void clickTabBlog () {
    driver.findElement(Locators.LINK_BLOG).click();
    }
}
