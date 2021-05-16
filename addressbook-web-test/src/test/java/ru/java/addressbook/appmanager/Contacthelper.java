package ru.java.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ru.java.addressbook.model.PersonData;

import java.util.ArrayList;
import java.util.List;

public class Contacthelper extends HelperBase {
  ;

  public Contacthelper(WebDriver driver) {
    super(driver);
  }

  public void fillContactForm(PersonData personData) {
    type(By.name("firstname"), personData.getFirstname());
    type(By.name("lastname"), personData.getSecondname());
    type(By.name("nickname"), personData.getNickname());
    type(By.name("company"), personData.getCompanyname());
    type(By.name("mobile"), personData.getPhone());
    type(By.name("work"), personData.getWork());
    type(By.name("email"), personData.getEmail());
    dateOfBirth(personData.getDay(), personData.getMonth(), personData.getYear());
  }

  public void type(By locator, String secondname) {
    click(locator);
    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(secondname);
  }

  private void dateOfBirth(String Day, String Month, String Year) {
    type(Day, By.name("bday"), By.xpath("//option[@value='18']"));
    type(Month, By.name("bmonth"), By.xpath("//option[@value='May']"));
    type(By.name("byear"), Year);
  }

  private void type(String Day, By locator, By date) {
    click(locator);
    new Select(driver.findElement(locator)).selectByVisibleText(Day);
    click(date);
  }

  public void getClick() {
    click(By.xpath("(//input[@name='submit'])"));
  }

  public void click(By locator) {
    driver.findElement(locator).click();
  }

  public void gotoAddNewPage() {
    click(By.linkText("add new"));
  }

  public void gotoHomePage() {
    click(By.linkText("home"));
  }

  public void editContact() {
    click(By.xpath("(//img[@alt='Edit'])"));
  }

  public void clickUpdate() {
    click(By.xpath("(//input[@name='update'])"));
  }

  public void selectContact(int index) {
    driver.findElements(By.name("selected[]")).get(index).click();
  }

  public void clickDelete() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public void createContact(PersonData person) {
    gotoAddNewPage();
    fillContactForm(person);
    getClick();
  }

  public int getContactCount() {
    return driver.findElements(By.name("selected[]")).size();
  }

  public List <PersonData> getContactList() {
    List<PersonData> contacts = new ArrayList<PersonData>();
    List<WebElement> elements = driver.findElements(By.name("entry"));
    for (WebElement element: elements) {
      String firstname = element.getText();
      PersonData contact = new PersonData(firstname,null, null,null,null,null,null,null,null,null,null,null);
      contacts.add(contact);
    }
    return contacts;



  }
}
