import org.openqa.selenium.By;

public class Locators {
        //Media Page
        public static final By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
        //Registration
        public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
        public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
        public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
        public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");

        //Search
        public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    }

