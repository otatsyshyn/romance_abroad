package com.romanceabroad.ui;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.List;
public class BaseActions {


    protected WebDriver driver;
    protected WebDriverWait wait;


    public BaseActions(WebDriver driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }
    public static String generateNewNumber(String name, int length){
        return name + RandomStringUtils.random(length, "172984757");
    }


    public void getDropDownListByIndex(By locator, int index){
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(index);}

    public void getDropDownListByText(By locator, String text){
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);}

    public void getDropDownListByValue(By locator, String value){
        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }

    public void ajaxClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void ajaxClick(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        ajaxClick(driver.findElement(by));
    }
    public void ajaxClick(By by, int index) {
        wait.until (ExpectedConditions.elementToBeClickable(by));
        ajaxClick(driver.findElements(by).get(index));
    }
    public void performClick(By locator) {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().build().perform();
    }
    public void clickUnselectedCheckbox(By checkbox) {
        WebElement currentCheckbox = driver.findElement(checkbox);
        if (!currentCheckbox.isSelected()) {
        ajaxClick(currentCheckbox);
        }
    }
    public void scrollToBottomOfPage() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight);");
    }
    public void ajaxScroll(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void ajaxScroll(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(locator));
    }
    // Implicit Wait methods
    public void javaWait(int ms) {
        System.out.println("Parent!!!");
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void javaWaitSec(int sec) {
        try {
            Thread.sleep(sec *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void ajaxSendKeys(WebElement element, String text) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', ' " + text +"')", element);
    }
    public static String generateRandomString() {
        return new BigInteger(120, new SecureRandom()).toString(32);}


        // Method for random choice from Dropdown List
    public void selectItemDropDownRandomOption(By locator, String dropDownName) {
            try {
                WebElement element = driver.findElement(locator);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Select select = new Select(driver.findElement(locator));
                select.selectByIndex((int) (Math.random() * (select.getOptions().size() - 1)) + 1);
                System.out.println(dropDownName + ":" + select.getFirstSelectedOption().getText());
            } catch (NoSuchElementException e) {

        }
    }

    public void checkLinksOnWebPage(String typeElement, String attribute) {
        List<WebElement> links = driver.findElements(By.xpath(typeElement));
        System.out.println("Start taking attributes on page");
        for (int i = 0; i < links.size(); i++) {
            WebElement ele = links.get(i);
            String url = ele.getAttribute(attribute);
            verifyLinkActive(url);
        }
        System.out.println("Total links are" + links.size());
    }
    // Method for link verification
    public void verifyLinkActive (String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(3000);
            httpURLConnect.connect();
            if (httpURLConnect.getResponseCode() ==200) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            }
            else if (httpURLConnect.getResponseCode() >=400 && httpURLConnect.getResponseCode()<=504){
                System.out.println(linkUrl + "-" + httpURLConnect.getResponseMessage() + "-" + httpURLConnect.getResponseMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public int getSizeDropDownList(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Select select = new Select(driver.findElement(locator));
            return select.getOptions().size();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("getSizeDropDownList error");
        }
        return 0;
}

    public void clickValueOfLists(By locator, String text) {
        List<WebElement> elements = driver.findElements(locator);
        for (int i = 0; i < elements.size(); i++) {
            WebElement elementOfList = elements.get(i);
            String value = elementOfList.getText();
            if(value.contains(text)) {
                elementOfList.click();
            }

        }
    }

    public String getAnyTitle() {
        String title = driver.findElement(Locators.MAIN_PAGE_TABS).getText();
        return title;
    }

}


