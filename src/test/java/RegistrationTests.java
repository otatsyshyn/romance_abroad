import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class RegistrationTests extends BaseUI {

    @Test public void testRegistration() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
        WebElement checkboxConfirmation = driver.findElement(Locators.BUTTON_CONFIRMATION);
        if (!driver.findElement(Locators.LINK_SEARCH).isSelected()){
            checkboxConfirmation.click();
        }else{
            Assert.fail("Checkbox is already selected");
        }
    }
}