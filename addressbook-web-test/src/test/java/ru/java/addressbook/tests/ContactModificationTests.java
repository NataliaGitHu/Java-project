package ru.java.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.java.addressbook.model.PersonData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification () {
        app.getContacthelper().gotoHomePage();
        int before = app.getContacthelper().getContactCount();
        if(!app.getContacthelper().isThereAContact()){
            app.getContacthelper().createContact(new PersonData("Natalia", "Talalova", "N", "ISSART", "89088086088", "talalovanatalia1@gmail.com", "work", "test1", "(//option[@value='1'])[3]", "18", "May", "1992"));
            app.getContacthelper().gotoHomePage();
        }
        app.getContacthelper().selectContact(before-1);
        app.getContacthelper().editContact();
        app.getContacthelper().fillContactForm(new PersonData("Natalya", "T", "NNN", "ISSART", "89136369094", "talalovanatalia1@gmail.com", "work", "test2", "(//option[@value='1'])[3]", "18", "May", "1992"));
        app.getContacthelper().clickUpdate();
        int after = app.getContacthelper().getContactCount();
        Assert.assertEquals(after, before);
    }

}
