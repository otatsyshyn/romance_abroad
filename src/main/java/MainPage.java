import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public void completeFirstPartOfRegistration(){
    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
    driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
    wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
}
public void completeSecondPartOfRegistration(){

    driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
    driver.findElement(Locators.BUTTON_NEXT).click();
    driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.nickname, 10));
    driver.findElement(Locators.DROP_DOWN_LIST_SELECT_DAY).click();
    driver.findElement(Locators.DROP_DOWN_LIST_SELECT_DAY_5).click();
    driver.findElement(Locators.DROP_DOWN_LIST_SELECT_MONTH).click();
    driver.findElement(Locators.DROP_DOWN_LIST_SELECT_MONTH_FEB).click();
    driver.findElement(Locators.DROP_DOWN_LIST_SELECT_YEAR).click();
    driver.findElement(Locators.DROP_DOWN_LIST_SELECT_YEAR_1997).click();
    driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
    WebElement checkboxConfirmation = driver.findElement(Locators.BUTTON_CONFIRMATION);
    checkboxConfirmation.click();
}
}
