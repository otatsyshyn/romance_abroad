import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class MainPageTests extends BaseUI {

    @Test
    public void testMainPage() throws InterruptedException {
        Thread.sleep(3000);
        WebElement ele = driver.findElement(Locators.LINK_VIDEO);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.BUTTON_VIDEO).click();
    }

    @Test
    public void testLinksOnMainPage() {
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
        driver.findElement(Locators.LINK_SEARCH);
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");

    }


}