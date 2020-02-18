package com.romanceabroad.ui;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class RegistrationTests extends BaseUI {


    @Test(dataProvider = "Registration2", dataProviderClass = DataProviders.class)
    public void testRegistration2(String email, String nickname, boolean requirement) {
        System.out.println(email);
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, Data.password);

        if (!requirement)
        {
            Assert.assertTrue(driver.findElement(Locators.TOOLTIP_ERROR).isDisplayed());
        }else {

        mainPage.completeSecondPartOfRegistration(nickname, Data.phone,
                Data.month, Data.day, Data.year, Data.city, Data.location);}
    }

    @Test (dataProvider = "Registration", dataProviderClass = DataProviders.class)
    public void testRegistration(String email, String password, String day, String month, String year, String phone, String city, String location) {

        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, password);
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 10),
                phone, month, day, year, city, location);
    }
}

/*@Test (dataProvider = "Registration2")
    public void testRegistration(String email, String password, String day, String month, String year, String phone, String location, String city) {

        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, password);
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(com.romanceabroad.ui.Data.nickname, 10),
                phone, month, day, year, city, location);


        WebElement checkboxConfirmation = driver.findElement(com.romanceabroad.ui.Locators.CHECKBOX_CONFIRMATION);
        if (!driver.findElement(com.romanceabroad.ui.Locators.LINK_SEARCH).isSelected()){
            checkboxConfirmation.click();
        }else{
            Assert.fail("Checkbox is already selected");
        }*/



