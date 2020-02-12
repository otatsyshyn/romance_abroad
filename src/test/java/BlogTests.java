import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTests extends BaseUI {
    String titleArticle;
    String nameOfArticles;

    @Test
    public void testArticlesAndTitles() {
        mainPage.clickTabBlog();
        List<WebElement> linksOfArticles = blogPage.collectAllLinksOfArticles();
        for (int i = 0; i < linksOfArticles.size() ; i++) {
            WebElement link = linksOfArticles.get(i);
            nameOfArticles = link.getText();
            if (nameOfArticles.contains("How it works")){

            }else
            if (nameOfArticles.contains("Kharkov Dating & Marriage Agency")){

            }else
            if (nameOfArticles.contains("Kiev marriage agency")){

            }else
            if (nameOfArticles.contains("Odessa Dating Agency")){

            }else
            if (nameOfArticles.contains("Mail Order Girls Catalog")){

            }else
            if (nameOfArticles.contains("Beautiful Ukrainian Girls Online")){

            }else
            if (nameOfArticles.contains("Beautiful Brides in Ukraine")){

            }else
            if (nameOfArticles.contains("Eastern European Girls")){

            }else
            if (nameOfArticles.contains("Marriage And Dating Agency")){

            }else
            if (nameOfArticles.contains("Kiev Matchmaking Agency")){

            }else
            if (nameOfArticles.contains("Find Ukrainian Girlfriend Online")){

            }else
            if (nameOfArticles.contains("Slavic Lady for Marriage")){

            }else
            if (nameOfArticles.contains("How To Marry Ukraine Women")){

            }else
            if (nameOfArticles.contains("Ukrainian dating website for singles")){

            }else
            if (nameOfArticles.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")){

            }else
            if (nameOfArticles.contains("Is There a Difference Between Dating or Courting a Ukrainian Woman?")){

            }
            else {
            link.click();
            titleArticle = blogPage.getAnyTitle();
            Assert.assertEquals(nameOfArticles, titleArticle);
            linksOfArticles = blogPage.collectAllLinksOfArticles();
            }
        }
    }
}

