import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrlSearch;
    String currentUrlMedia;
    String currentUrlGifts;
    String currentUrlPrettywomen;
    String currentUrlTourtoukraine;
    String currentUrlBlog;
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    String expectedUrlMedia = "https://romanceabroad.com/media/index";
    String expectedUrlGifts = "https://romanceabroad.com/store/category-sweets";
    String expectedUrlPrettywomen = "https://romanceabroad.com/users/search";
    String expectedUrlTourtoukraine = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";
    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    By LINK_HOME_PAGE = By.xpath("//a[text()='HOME'][@class='nav-link']");
    By LINK_HIW = By.xpath("//a[text()='HOW WE WORK'][@class='nav-link ']");
    By LINK_GIFTS_PAGE = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    By LINK_PRETTY_WOMEN_PAGE = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_TOUR_TO_UKRAINE_PAGE = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By LINK_BLOG_PAGE = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
    By LINK_SIGN_IN = By.xpath("//a[text()='SIGN IN'][@class='nav-link active']");
    By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    int indexLinkSignIn = 0;
    LINK_SIGN_IN.findElement(driver).get(indexLinkSignIn).click();

    String email = "789@gmail.com";
    String password = "wuwuwuuw!!!";






    By BUTTTON_SUBMIT = By.xpath("//a");



    @BeforeMethod

    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @Test
    public void testSearchPage() {
        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);

    }

    @Test
    public void testMainPage() {
        driver.findElement(LINK_MEDIA).click();
        currentUrlMedia= driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, expectedUrlMedia);


    }

    @Test
    public void testHomePage() {
        driver.findElements(LINK_HOME_PAGE).get(0).click();

    }
    @Test
    public void testHIW() {
        driver.findElements(LINK_HIW).get(0).click();

    }

    @Test public void testGiftsPage() {
        driver.findElement(LINK_GIFTS_PAGE).click();
        currentUrlGifts= driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts, expectedUrlGifts);


    }
    
    @Test public void testPrettywomen() {
        driver.findElement(LINK_PRETTY_WOMEN_PAGE).click();
        currentUrlPrettywomen = driver.getCurrentUrl();
        System.out.println(currentUrlPrettywomen);
        Assert.assertEquals(currentUrlPrettywomen, expectedUrlPrettywomen);


    }
    @Test public void testTourtoukraine() {
        driver.findElement(LINK_TOUR_TO_UKRAINE_PAGE).click();
        currentUrlTourtoukraine = driver.getCurrentUrl();
        System.out.println(currentUrlTourtoukraine);
        Assert.assertEquals(currentUrlTourtoukraine, expectedUrlTourtoukraine);


    }
    @Test public void testBlog() {
        driver.findElement(LINK_BLOG_PAGE).click();
        currentUrlBlog = driver.getCurrentUrl();
        System.out.println(currentUrlBlog);
        Assert.assertEquals(currentUrlBlog, expectedUrlBlog);


    }
    @Test public void testSignIn() {

        WebElement element= driver.findElement(LINK_SIGN_IN);

    }

    @Test public void testRegistration() {
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(TEXT_FIELD_EMAIL).sendKeys(email);
        driver.findElement(TEXT_FIELD_PASSWORD).sendKeys(password);
        WebElement buttonNext = driver.findElement(BUTTON_NEXT);
        buttonNext.click();

    }


    @AfterMethod
    public void afterActions() {

        driver.quit();
    }
}