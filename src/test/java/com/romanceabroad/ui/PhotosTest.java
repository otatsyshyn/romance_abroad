package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PhotosTest extends BaseUI{
    String actualTitle;
    @Test
    public  void testUserTabs(){
        photosPage.clickPhotosTab();
        List<WebElement> usersTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);
        actualTitle = photosPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitleAllPhotos);

        for (int i = 0; i < usersTabs.size(); i++) {
            usersTabs.get(i).click();
            actualTitle = photosPage.getAnyTitle();
            Assert.assertEquals(actualTitle, Data.expectedTitleAllPhotos);

            if (i == 0) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGallery);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitlePhotoGallery);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitleVideoGallery);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGalleryAlbums);
            }
            usersTabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);
        }
    }
}
