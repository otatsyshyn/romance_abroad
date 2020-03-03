package com.romanceabroad.ui;

import org.testng.annotations.Test;
public class ContactUsTests extends BaseUI {

    @Test
    public void testContactUs() {
        mainPage.clickTabBlog();
        contactUs.clickContactUsButton();
        contactUs.submitContactUsForm(Data.contact_us_reason, Data.contact_us_username,
                Data.contact_us_email, Data.contact_us_message, Data.contact_us_subject);
    }
}