import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class RegistrationTests extends BaseUI {


    //int indexLinkSignIn = 0;
    //LINK_SIGN_IN.findElement(driver).get(indexLinkSignIn).click();


    @Test public void testRegistration() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_NEXT).click();

    }
    public void afterActions() {

        //driver.quit();
    }
}