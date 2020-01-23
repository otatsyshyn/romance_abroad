import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class RegistrationTests extends BaseUI {

    @DataProvider(name = "Registration")
    public static Object[][] testRegistration2() throws Exception{
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("Registration_param.csv")).stream().forEach(s-> {

            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});

        });

        return out.toArray(new Object[out.size()][]);
    }
    @Test (dataProvider = "Registration")
    public void testRegistration(String email, String password, String day, String month, String year, String phone, String location, String city) {

        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, password);
        mainPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.nickname, 10), phone, month, day, year, city, location);


       //***Please find another part of HW 19: Data provider with 1 parameter in 'Conditions' Test Cases (row 132)




        /*WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        if (!driver.findElement(Locators.LINK_SEARCH).isSelected()){
            checkboxConfirmation.click();
        }else{
            Assert.fail("Checkbox is already selected");
        }*/
    }


}