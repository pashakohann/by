package by.epam.jwd.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private String lastName;
    private String firstName;
    private String middleName;
    private String city;
    private String street;
    private int flat;

    private List<Account> accountList = new ArrayList<>();

    public Client(String lastName, String firstName, String middleName, String city, String street, int flat, Account account) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.city = city;
        this.street = street;
        this.flat = flat;
        accountList.add(account);
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public void addOneAccound(Account account) {
        accountList.add(account);
    }

    @Override
    public String toString() {
        return "Client{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", flat='" + flat + '\'' +
                ", accountList=" + accountList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(lastName, client.lastName) &&
                Objects.equals(firstName, client.firstName) &&
                Objects.equals(middleName, client.middleName) &&
                Objects.equals(city, client.city) &&
                Objects.equals(street, client.street) &&
                Objects.equals(flat, client.flat) &&
                Objects.equals(accountList, client.accountList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, middleName, city, street, flat, accountList);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
}
