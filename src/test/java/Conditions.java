import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Conditions extends BaseUI {

@Test
    public void test () {
        String fruit1 = "kiwi";
        String fruit2 = "";
        if (fruit1.contains("kiwi") || fruit2.contains("kiwi")){
            System.out.println("It contains kiwi");
        }else{
        Assert.fail("We can't find fruit");}
    }
    @Test

    public void test2 () {
        int number = 10;
        int sum;
        if (number == 10 +5){
            sum=95+100;
        } else {sum = 100-95;
        }
        System.out.println(sum);
    }
    @Test
    public void test3 (){
        boolean requirement = true;
        if (requirement){
        System.out.println("Boolean is true");
            }
            else { Assert.fail("Boolean is failed");}

    }
    @Test
    public void test4 () {

        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();

        WebElement checkboxConfirmation = driver.findElement(Locators.BUTTON_CONFIRMATION);
        checkboxConfirmation.click();
        if (!checkboxConfirmation.isSelected()){
            checkboxConfirmation.click();
        }
    }

}

