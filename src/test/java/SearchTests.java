import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI{
    String currentUrlSearch;


    @Test
    public void testSearchPage() {
        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);

    }
}