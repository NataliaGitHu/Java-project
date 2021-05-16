package ru.java.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.java.addressbook.model.PersonData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testPersonDeletion() {
        app.getContacthelper().gotoHomePage();
        if(!app.getContacthelper().isThereAContact()){
            app.getContacthelper().createContact(new PersonData("Natalia", "Talalova", "N", "ISSART", "89088086088", "talalovanatalia1@gmail.com", "work", "test1", "(//option[@value='1'])[3]", "18", "May", "1992"));
        }
        List<PersonData> before = app.getContacthelper().getContactList();
        app.getContacthelper().selectContact(before.size()-1);
        app.getContacthelper().editContact();
        app.getContacthelper().clickDelete();
        List<PersonData> after = app.getContacthelper().getContactList();
        Assert.assertEquals(after.size(), before.size() -1);

        before.remove(before.size()-1);
        Assert.assertEquals(after, before);
    }

}
