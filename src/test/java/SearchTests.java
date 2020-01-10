import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchTests extends BaseUI{
    String currentUrlSearch;

    public static final boolean testCase11 = true;
    public static final boolean testCase12 = true;
    public static final boolean testCase13 = true;


    @Test (priority = 1, enabled = testCase11, groups = {"users", "admin"})
    public void testSearchPageTestCase11() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(),"Element was not displayed");
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        //Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        //softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "Url is not correct");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY, 0);
        softAssert.assertAll();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test (priority = 3, enabled = testCase13, groups = {"users", "admin"})
    public void validateAssertionsTestcase13 () {
        Assert.assertEquals("Web", "Web");
    }
    @Test (priority = 2, enabled = testCase12, groups ="ie")
    public void selectRandomDropDownListTestCase13() {
        driver.findElement(Locators.LINK_SEARCH).click();

        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGE);
        mainPage.javaWaitSec(3);
        System.out.println(sizeOfDropDownListSortBy);
        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
        searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGE, "Sort by");
        mainPage.javaWaitSec(3);
    }
}
}