package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class SearchTests extends BaseUI{
    String currentUrlSearch;

    public static final boolean testCase11 = true;
    public static final boolean testCase12 = true;
    public static final boolean testCase13 = true;
    public static final boolean testCase14 = true;


    @Test (priority = 1, enabled = testCase11, groups = {"users", "admin"})
    public void testSearchPageTestCase11() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(),"Element was not displayed");
        searchPage.clickPrettyWomen();
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        //Assert.assertEquals(currentUrlSearch, com.romanceabroad.ui.Data.expectedUrlSearch);
        softAssert.assertEquals(currentUrlSearch, com.romanceabroad.ui.Data.expectedUrlSearch, "Url is not correct");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY, 0);
        softAssert.assertAll();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*@Test (priority = 3, enabled = testCase13, groups = {"users", "admin"})
    public void validateAssertionsTestcase13 () {
        Assert.assertEquals("Web", "Web");
    }*/
    @Test (priority = 2, enabled = testCase12, groups ="users")
    public void selectRandomDropDownListTestCase13() {
        searchPage.clickPrettyWomen();
        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGE);
        mainPage.javaWaitSec(3);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
        searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGE, "Sort by");
        mainPage.javaWaitSec(3);
        }
    }
        @Test (dataProvider = "Search", dataProviderClass = DataProviders.class, priority=1, enabled=testCase14, groups = {"user","admin"})
        public void searchDifferentResults14(String minAge, String maxAge, String sortBy){
        int min = Integer.parseInt(minAge);
        int max = Integer.parseInt(maxAge);
            System.out.println(min);
            System.out.println(max);

            searchPage.clickPrettyWomen();
            searchPage.getDropDownListByText((By) driver.findElement (Locators.DROP_DOWN_MIN_AGE),minAge);
            searchPage.getDropDownListByText((By) driver.findElement (Locators.DROP_DOWN_LIST_SORT_BY), maxAge);
            searchPage.getDropDownListByText((By) driver.findElement(Locators.DROP_DOWN_MAX_AGE), sortBy);
            searchPage.clickSearchButton();

            List<WebElement> infoAboutUser = driver.findElements(By.xpath("//div[@class='text-overflow']"));
            for (int i = 0; i < infoAboutUser.size(); i++) {
                WebElement text = infoAboutUser.get(i);
                wait.until(ExpectedConditions.visibilityOf(text));
                String info = text.getText();
                System.out.println(info);

            }

            }
        }

