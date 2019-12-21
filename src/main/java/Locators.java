import org.openqa.selenium.By;

public class Locators {
        //Main Page
        public static final By MAIN_PAGE = By.xpath("//ul[@class='navbar-nav']//li");
        public static final By MAIN_PAGE_LIST = By.xpath("//ul.li");
        //Media Page
        public static final By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
        public static final By LINK_VIDEO = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");

        //Registration
        public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
        public static final By DROP_DOWN_LIST_SELECT_DAY = By.cssSelector("#daySelect");
        public static final By DROP_DOWN_LIST_SELECT_DAY_5 = By.xpath("//li[@data-handler='selectDay']//a[text()='5']");
        public static final By DROP_DOWN_LIST_SELECT_MONTH = By.cssSelector("#monthSelect");
        public static final By DROP_DOWN_LIST_SELECT_MONTH_FEB = By.xpath("//li[@data-handler='selectMonth']//a[text()='Feb']");
        public static final By DROP_DOWN_LIST_SELECT_YEAR = By.cssSelector("#yearSelect");
        public static final By DROP_DOWN_LIST_SELECT_YEAR_1997 = By.cssSelector("#yearSelect");
        public static final By BUTTON_CONFIRMATION = By.cssSelector("input#confirmation");
        public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
        public static final By BUTTON_VIDEO = By.xpath("//button[@class='ytp-large-play-button ytp-button']");
        public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
        public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
        public static final By TEXT_FIELD_NICKNAME= By.xpath("//input[@data-field='nickname']");
        public static final By TEXT_FIELD_PHONE= By.xpath("//input[@name='data[phone]']");

        //Search
        public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
        public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    }

