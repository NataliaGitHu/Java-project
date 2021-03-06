package ru.java.addressbook.model;

import java.util.Objects;

public class PersonData {
    private final String firstname;
    private final String secondname;
    private final String nickname;
    private final String companyname;
    private final String phone;
    private final String email;
    private final String work;
    private final String day;
    private final String month;
    private final String year;

    public PersonData(String firstname, String Secondname, String Nickname, String Companyname, String Phone, String email, String Work, String group, String xpathExpression, String day, String month, String year) {
        this.firstname = firstname;
        secondname = Secondname;
        nickname = Nickname;
        companyname = Companyname;
        phone = Phone;
        this.email = email;
        work = Work;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getWork() {
        return work;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonData that = (PersonData) o;
        return Objects.equals(firstname, that.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname);
    }

    @Override
    public String toString() {
        return "PersonData{" +
                "firstname='" + firstname + '\'' +
                '}';
    }
}
