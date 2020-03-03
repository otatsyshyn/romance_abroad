package com.romanceabroad.ui;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

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
    @Test
    public void smokeTestMainPage () {
        List<WebElement> mainTabs = driver.findElements(Locators.MAIN_PAGE_BAR);
        for (int i = 0; i < mainTabs.size(); i++) {
            mainTabs.get(i).click();
            driver.get(Data.expectedUrlMainPage);
            mainTabs = driver.findElements(Locators.MAIN_PAGE_BAR);

        }
    }

        @Test
        public void print(){
            mainPage.javaWait(5000);
        }
    }


