package ru.java.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testPersonDeletion() {
        app.getContacthelper().gotoHomePage();
        app.getContacthelper().selectContact();
        app.getContacthelper().editContact();
        app.getContacthelper().clickDelete();
    }

}
