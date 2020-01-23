import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {

    @Test
    public void test1() {
        String fruit1 = "kiwi";
        String fruit2 = "";
        if (fruit1.contains("kiwi") || fruit2.contains("kiwi")) {
            System.out.println("It contains kiwi");
        } else {
            Assert.fail("We can't find fruit");
        }
    }

    @Test
    public void test2() {
        int number = 10;
        int sum;
        if (number == 10 + 5) {
            sum = 95 + 100;
        } else {
            sum = 100 - 95;
        }
        System.out.println(sum);
    }

    @Test
    public void test3() {
        boolean requirement = true;
        if (requirement) {
            System.out.println("Boolean is true");
        } else {
            Assert.fail("Boolean is failed");
        }
    }

    /*@Test
    public void test4() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();

        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        checkboxConfirmation.click();
        if (!checkboxConfirmation.isSelected()) {
            checkboxConfirmation.click();
        }
    }*/

    @Test
    public void test5() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String expectedUrlPrettyWomen = "https://romanceabroad.com/users/search";
        String expectedTitleHome = "UKRAINIAN GIRLS DATING SITE";
        List<WebElement> links = driver.findElements(Locators.MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            //links.get(i).click();
            mainPage.ajaxClick(links.get(i));

            if(info.contains("HOME")) {
                actualTitle = mainPage.getMainPageTabs();
                Assert.assertEquals(expectedTitleHome, actualTitle);
            }
            if(info.contains("PRETTY WOMEN")) {
                actualTitle = mainPage.getMainPageTabs();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(expectedUrlPrettyWomen, actualTitle);
                Assert.assertEquals(actualUrlPrettyWomen,expectedUrlPrettyWomen);
                driver.findElement(Locators.SINGLE_WOMEN_SEARCH).isDisplayed();
            }
            driver.get(Data.expectedUrlMainPage);
            links = driver.findElements(Locators.MAIN_PAGE_LIST);
        }
    }

     @Test
      public void test6() {
         //mainPage.ajaxClick(Locators.MAIN_PAGE, 3);
         //mainPage.performClick(Locators.MAIN_PAGE, 4);
         mainPage.scrollToBottomOfPage();
     }

    @Test
    public void test7(){
        List<String> crunchifList1 = new ArrayList<>(Arrays.asList("kiwi", "mango", "orange"));
        if (crunchifList1.contains("mango")) {

            System.out.println(crunchifList1);
        }
    }
    // Test Cases with Loops
    @Test
    public void test8() {
    List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    for (int i = 0; i <crunchifyList1.size() ; i++) {
    int element = crunchifyList1.get(i);
        System.out.println("Result int");

        }
    }






    @Test
    public void test9() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println(crunchifyList1);
        crunchifyList1.add(5);
        for (int i = 0; i < crunchifyList1.size(); i++) {
            int element = crunchifyList1.get(i);
            System.out.println("Result int added 5");
        }
    }

// Data provider with 1 parameter (Please OFF 'extends BaseUI' )

    @DataProvider(name = "Fruits")
    public static Object[][] testRegistration2() throws Exception{
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("fruits.csv")).stream().forEach(s-> {

            String[] data = s.split(",");
            out.add(new Object[]{data[0]});

        });

        return out.toArray(new Object[out.size()][]);
    }
    @Test (dataProvider = "Fruits")
    public void test10(String fruit) {
        String phrase = ("apple is in scope");
        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList(fruit, phrase));
        crunchifyList1.add("banana");
        for (int i = 0; i < crunchifyList1.size(); i++) {
            String element = crunchifyList1.get(i);
            System.out.println(i + " interation");
            if (element.contains("app")) {
                System.out.println(phrase);
                //break;

            if (element.contains("wi"));
                System.out.println("kiwi");

            } else {
                System.out.println("Bad loop");
            }
        }
    }

}

