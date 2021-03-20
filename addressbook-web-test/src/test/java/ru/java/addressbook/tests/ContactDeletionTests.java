package ru.java.addressbook.tests;

import org.testng.annotations.Test;
import ru.java.addressbook.model.PersonData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testPersonDeletion() {
        app.getContacthelper().gotoHomePage();
        if(!app.getContacthelper().isThereAContact()){
            app.getContacthelper().createContact(new PersonData("Natalia", "Talalova", "N", "ISSART", "89088086088", "talalovanatalia1@gmail.com", "work", "test1", "(//option[@value='1'])[3]", "18", "May", "1992"));
        }
        app.getContacthelper().selectContact();
        app.getContacthelper().editContact();
        app.getContacthelper().clickDelete();
    }

}
