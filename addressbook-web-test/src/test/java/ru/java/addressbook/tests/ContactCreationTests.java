package ru.java.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.java.addressbook.model.PersonData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testNewContactCreation() throws Exception {
    app.getContacthelper().gotoHomePage();
    int before = app.getContacthelper().getContactCount();
    app.getContacthelper().createContact(new PersonData("Natalia", "Talalova", "N", "ISSART", "89088086088", "talalovanatalia1@gmail.com", "work", "test1", "(//option[@value='1'])[3]", "18", "May", "1992"));
    int after = app.getContacthelper().getContactCount();
    Assert.assertEquals(after, before+1);
  }
}
