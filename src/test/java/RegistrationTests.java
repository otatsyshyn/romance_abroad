import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class RegistrationTests extends BaseUI {

    @Test public void testRegistration() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(Data.email, Data.password);
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 10), Data.phone,
                Data.month,Data.day,Data.year,
                Data.location, Data.city);


        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        if (!driver.findElement(Locators.LINK_SEARCH).isSelected()){
            checkboxConfirmation.click();
        }else{
            Assert.fail("Checkbox is already selected");
        }
    }
}