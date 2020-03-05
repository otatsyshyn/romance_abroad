package com.romanceabroad.ui;

import org.openqa.selenium.By;

public class Locators {

        //public static final By H1_TITLE = By.xpath("//h1");
        //Main Page
        public static final By MAIN_PAGE = By.xpath("//ul[@class='navbar-nav']//li");
        public static final By MAIN_PAGE_BAR = By.xpath("//ul[@class='navbar-nav']//li/a");
        //ul[@class='navbar-nav']//li/a
        public static final By MAIN_PAGE_LIST = By.xpath("//ul.li");
        public static final By MAIN_PAGE_TABS = By.xpath("//h1");

        //Photos Page
        public static final By LINK_MEDIA = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
        public static final By LINK_TAB_USER_PROFILE= By.xpath("//ul[@id = 'gallery_filters']//a");
        public static final By LINK_VIDEO = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
        public static final By PHOTO_ALBUM = By.xpath("//span[@data-click='album']");
        public static final By PHOTO_BLOCK = By.xpath("//div[@class='g-flatty-block']");

        //Registration
        public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
        public static final By DROP_DOWN_LIST_SELECT_DAY = By.cssSelector("#daySelect");
        public static final By DROP_DOWN_LIST_SELECT_VALUE_DAY = By.xpath("//li[@data-handler='selectDay']//a");
        public static final By DROP_DOWN_LIST_SELECT_MONTH = By.cssSelector("#monthSelect");
        public static final By DROP_DOWN_LIST_SELECT_VALUE_MONTH = By.xpath("//li[@data-handler='selectMonth']//a");
        public static final By DROP_DOWN_LIST_SELECT_YEAR = By.cssSelector("#yearSelect");
        public static final By DROP_DOWN_LIST_SELECT_VALUE_YEAR = By.cssSelector("#yearSelect");
        public static final By CHECKBOX_CONFIRMATION = By.cssSelector("input#confirmation");
        public static final By AUTOFILLING_FORM_LOCATION = By.xpath("//input[@name='region_name']");
        public static final By DROP_DOWN_LIST_VALUE_LOCATION = By.xpath("//div[@class='dropdown dropdown_location']//ul//li");
        public static final By TOOLTIP_ERROR = By.xpath("//div[@class='tooltip']");
        public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
        public static final By BUTTON_VIDEO = By.xpath("//button[@class='ytp-large-play-button ytp-button']");
        public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
        public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
        public static final By TEXT_FIELD_NICKNAME = By.xpath("//input[@data-field='nickname']");
        public static final By TEXT_FIELD_PHONE= By.xpath("//input[@name='data[phone]']");

        //Search
        public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
        public static final By TEXT_USER_INFO= By.xpath("//div[@class='text-overflow']");
        //public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search'][@id='sorter-link-4652']");

        public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
        public static final By SINGLE_WOMEN_SEARCH = By.xpath("//a@class='g-pic-border g-rounded'");
        public static final By DROP_DOWN_MAX_AGE = By.cssSelector("select#age_max");
        public static final By DROP_DOWN_MIN_AGE = By.cssSelector("select#age_min");
        public static final By BUTTON_SEARCH = By.cssSelector("#main_search_button_user_advanced");

        //Contact Us (Tickets)
        public static final By LINK_CONTACT_US_FORM = By.xpath("//a[@href='https://romanceabroad.com/tickets/']");
        public static final By CONTACT_US_DROP_DOWN_LIST_REASON = By.xpath("//select[@class='form-control']");
        public static final By CONTACT_US_DROP_DOWN_LIST_VALUE_REASON = By.xpath("//select[@class='form-control']");
        public static final By CONTACT_US_FORM_USER_NAME = By.xpath("//input[@name='user_name']");
        public static final By CONTACT_US_FORM_EMAIL = By.xpath("//input[@name='user_email']");
        public static final By CONTACT_US_FORM_SUBJECT = By.xpath("//input[@name='subject']");
        public static final By CONTACT_US_FORM_MESSAGE = By.xpath("//textarea[@class='form-control']");

        public static final By CONTACT_US_FORM_IMAGE_CAPTCHA = By.xpath("//img[@src='https://romanceabroad.com/temp/captcha/1579309210.39.jpg']");
        public static final By CONTACT_US_FORM_INPUT_CAPTCHA = By.xpath("//input[@name='captcha_code']");
        public static final By CONTACT_US_BUTTON_SEND = By.xpath("//input[@value='Send']");

        //Blog page
        public static final By LINK_BLOG  = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
        public static final By LINKS_OF_ARTICLES  = By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//li");


    }

