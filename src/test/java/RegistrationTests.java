import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

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
        mainPage.clickNextButton();
        mainPage.completeSecondPartOfRegistration(nickname, Data.phone, Data.month, Data.day, Data.year, Data.city, Data.location);}
    }


    @Test (dataProvider = "Registration")
    public void testRegistration(String email, String password, String day, String month, String year, String phone, String location, String city) {

        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, password);
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 10),
                phone, month, day, year, city, location);



/*
@Test (dataProvider = "Registration2")
    public void testRegistration(String email, String password, String day, String month, String year, String phone, String location, String city) {

        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, password);
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 10),
                phone, month, day, year, city, location);*/



       //***Please find another part of HW 19: Data provider with 1 parameter in 'Conditions' Test Cases (row 132)




        /*WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        if (!driver.findElement(Locators.LINK_SEARCH).isSelected()){
            checkboxConfirmation.click();
        }else{
            Assert.fail("Checkbox is already selected");
        }*/
    }


}