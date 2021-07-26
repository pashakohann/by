package by.epam.jwd.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {
    private List<Client> clientList = new ArrayList<>();
    private List<Account> accountList = new ArrayList<>();

    public Bank() {

    }

    @Override
    public String toString() {
        return "Bank{" +
                "clientList=" + clientList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(clientList, bank.clientList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientList);
    }

    public List<Client> getClientList() {
        return clientList;
    }


    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public void addClient(Client client) {
        clientList.add(client);
    }
}
