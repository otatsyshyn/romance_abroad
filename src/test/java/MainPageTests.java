import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class MainPageTests extends BaseUI {
    BaseActions baseActions = new BaseActions();
    @Test
    public void testMainPage2() throws InterruptedException {
        Thread.sleep(3000);
        WebElement ele = driver.findElement(Locators.LINK_VIDEO);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.BUTTON_VIDEO).click();
    }
}