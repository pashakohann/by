package by.epam.jwd.logic;

import by.epam.jwd.entity.Account;
import by.epam.jwd.entity.Bank;
import by.epam.jwd.entity.Client;

import java.util.Set;
import java.util.TreeSet;

public class BankLogic {
    private Bank bank;

    public BankLogic(Bank bank) {
        this.bank = bank;
    }

    public void blockAccount(Long account) {

        for (int y = 0; y < bank.getClientList().size(); y++) {
            for (int x = 0; x < bank.getClientList().get(y).getAccountList().size(); x++) {
                long sss = bank.getClientList().get(y).getAccountList().get(x).getNumberBankAccount();
                if (bank.getClientList().get(y).getAccountList().get(x).getNumberBankAccount() == account) {
                    bank.getClientList().get(y).getAccountList().get(x).setBlockAccount(true);
                }
            }

        }
    }

    public void unblockAccount(Long account) {
        for (int y = 0; y < bank.getClientList().size(); y++) {
            for (int x = 0; x < bank.getClientList().get(y).getAccountList().size(); x++) {

                if (bank.getClientList().get(y).getAccountList().get(x).getNumberBankAccount() == account) {
                    bank.getClientList().get(y).getAccountList().get(x).setBlockAccount(false);

                }

            }

        }
    }

    public void findAccount(Long numberBankAccount) {
        for (int y = 0; y < bank.getClientList().size(); y++) {
            for (int x = 0; x < bank.getClientList().get(y).getAccountList().size(); x++) {

                if (bank.getClientList().get(y).getAccountList().get(x).getNumberBankAccount() == numberBankAccount) {
                    System.out.println("Счет найден.");
                    System.out.println(bank.getClientList().get(y).getLastName() + " " + bank.getClientList().get(y).getFirstName() + " " + bank.getClientList().get(y).getMiddleName());
                    System.out.println(bank.getClientList().get(y).getCity() + " " + bank.getClientList().get(y).getStreet() + " " + bank.getClientList().get(y).getFlat());
                    if (bank.getClientList().get(y).getAccountList().get(x).isBlockAccount()) {
                        System.out.println("Счет заблокирован");
                    }

                }
            }
        }

    }

    public void sortAccount() {
        Set<Long> listNumberBankAccount = new TreeSet<>();
        for (int y = 0; y < bank.getClientList().size(); y++) {
            for (int x = 0; x < bank.getClientList().get(y).getAccountList().size(); x++) {
                listNumberBankAccount.add(bank.getClientList().get(y).getAccountList().get(x).getNumberBankAccount());
            }

        }

        for (long accountBank : listNumberBankAccount) {
            System.out.println(accountBank);
        }

    }

    public void totalAmountClient(Client client) {
        long result = 0;

        for (int y = 0; y < client.getAccountList().size(); y++) {
            if (!client.getAccountList().get(y).isBlockAccount()) {
                result = result + client.getAccountList().get(y).getAccountAmount();
            } else {
                System.out.println("Счето номер : " + client.getAccountList().get(y) + " заблокирован.");
            }
        }

        System.out.println("Общая сумма клиента : " + result);
    }

    public void totalAmoutClientWithPositiveAndNegative(Client client) {
        long resultPositive = 0;
        long resultNegative = 0;

        for (int y = 0; y < client.getAccountList().size(); y++) {
            if (!client.getAccountList().get(y).isBlockAccount()) {
                if (client.getAccountList().get(y).getAccountAmount() > 0) {
                    resultPositive = resultPositive + client.getAccountList().get(y).getAccountAmount();
                } else {
                    resultNegative = resultNegative + client.getAccountList().get(y).getAccountAmount();
                }

            } else {
                System.out.println("Счето номер : " + client.getAccountList().get(y) + " заблокирован.");
            }

        }
        System.out.println("Общая положительная сумма со все счетов :" + resultPositive);
        System.out.println("Общая отрицательная  сумма со всех счетов :" + resultNegative);
    }

    public void accoutIsBlockedOrNot(Account account) {

        if (account.isBlockAccount()) {
            System.out.println("Данный счет заблокирован");
        } else {
            System.out.println("Данный счет не заблокирован");
        }
    }
}
