import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {
public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
public void clickJoinButton(){

    driver.findElement(Locators.BUTTON_REGISTRATION).click();
}

public void completeFirstPartOfRegistration(String email, String password){
    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email);
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
    driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(password);
    wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
}
public void completeSecondPartOfRegistration(String nickname, String phone,
                                             String  month, String day, String year,
                                             String city, String location){
    driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
    driver.findElement(Locators.BUTTON_NEXT).click();
    driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys();

    driver.findElement(Locators.DROP_DOWN_LIST_SELECT_DAY).click();
    clickValueOfLists(Locators.DROP_DOWN_LIST_SELECT_VALUE_DAY, day);

    driver.findElement(Locators.DROP_DOWN_LIST_SELECT_MONTH).click();
    clickValueOfLists(Locators.DROP_DOWN_LIST_SELECT_VALUE_MONTH, month);

    driver.findElement(Locators.DROP_DOWN_LIST_SELECT_YEAR).click();
    clickValueOfLists(Locators.DROP_DOWN_LIST_SELECT_VALUE_YEAR,year);

    driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(phone);
    driver.findElement(Locators.CHECKBOX_CONFIRMATION).click();

    driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).clear();
    driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).sendKeys("Texas City, United States");
    clickValueOfLists(Locators.DROP_DOWN_LIST_VALUE_LOCATION, location);
    }
public String getMainPageTabs () {
    String text = driver.findElement(Locators.MAIN_PAGE_TABS).getText();
    return text;
   }
}
