package by.epam.jwd.main;

import by.epam.jwd.entity.Account;
import by.epam.jwd.entity.Bank;
import by.epam.jwd.entity.Client;
import by.epam.jwd.logic.BankLogic;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankLogic bl = new BankLogic(bank);
        Account ac1 = new Account(1325346L, 0);
        Account ac2 = new Account(325346L, 0);
        Account ac3 = new Account(1225346L, 0);
        Account ac4 = new Account(54625346L, 0);
        Account ac5 = new Account(87325346L, 0);
        Account ac6 = new Account(13237346L, 0);
        Client client = new Client("Шерман", "Эдуард", "Владимирович", "Минск", "Севастопольская", 15, ac1);
        client.addOneAccound(ac2);
        client.addOneAccound(ac3);
        client.getAccountList().get(0).setAccountAmount(358);
        client.getAccountList().get(1).setAccountAmount(-5);
        client.getAccountList().get(2).setAccountAmount(3);
        bank.addClient(client);

        Client client2 = new Client("Конан", "Вениамин", "Францевич", "Минск", "Некрасова", 56, ac4);
        client2.addOneAccound(ac5);
        client2.addOneAccound(ac6);
        client2.getAccountList().get(0).setAccountAmount(3231);
        client2.getAccountList().get(1).setAccountAmount(-15);
        client2.getAccountList().get(2).setAccountAmount(314);
        bank.addClient(client2);

        System.out.println("Блокирова и разблокировка счета: ");
        bl.blockAccount(325346L);
        bl.accoutIsBlockedOrNot(ac2);
        bl.unblockAccount(325346L);
        bl.accoutIsBlockedOrNot(ac2);
        System.out.println("Поиск счета: ");
        bl.findAccount(13237346L);
        System.out.println("Общая сумма со всех счетов с учетом - и + : ");
        bl.totalAmountClient(client2);

        System.out.println("Общая сумма со всех счетов с выводом + и - отдельно :");

        bl.totalAmoutClientWithPositiveAndNegative(client2);

        System.out.println("Сортировка счетов: ");
        bl.sortAccount();

    }
}
