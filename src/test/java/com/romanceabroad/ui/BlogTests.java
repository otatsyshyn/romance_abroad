package com.romanceabroad.ui;
import org.openqa.selenium.WebElement;
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

            if (nameOfArticles.contains("Kharkov dating agency")){

            }else if (nameOfArticles.contains("Kiev dating agency")){

            }else if (nameOfArticles.contains("Odessa dating agency")){

            }else if (nameOfArticles.contains("Mail order girls")){

            }else if (nameOfArticles.contains("Beautiful urkainian girls")){

            }else if (nameOfArticles.contains("Real Ukrainian brides")){

            }else if (nameOfArticles.contains("Eastern European women")){

            }else if (nameOfArticles.contains("Marriage agency in Ukraine")){

            }else if (nameOfArticles.contains("Kiev dating site")){

            }else if (nameOfArticles.contains("Find Ukrainian girlfriend")){

            }else if (nameOfArticles.contains("Slavic women for marriage")){

            }else if (nameOfArticles.contains("How to marry Ukrainian lady")){

            }else if (nameOfArticles.contains("Free Ukrainian dating site")){

            }else if (nameOfArticles.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")){

            }else if (nameOfArticles.contains("Ukrainian women for marriage"))
            {
            link.click();
            titleArticle = blogPage.getAnyTitle();
            linksOfArticles = blogPage.collectAllLinksOfArticles();
            }
        }
    }
}

