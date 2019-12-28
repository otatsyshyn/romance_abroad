import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchTests extends BaseUI{
    String currentUrlSearch;


    @Test
    public void testSearchPage() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(),"Element was not displayed");
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        //Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        //softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "Url is not correct");
        //softAssert.assertEquals(currentUrlSearch, Data.expectedUrlSearch, "Url is not correct");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY, 0);
        softAssert.assertAll();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();        }



}
}