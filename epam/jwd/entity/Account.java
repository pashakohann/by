package by.epam.jwd.entity;

import java.util.Objects;

public class Account {
    private long numberBankAccount;
    private boolean blockAccount;
    private long accountAmount;

    public Account(Long numberBankAccount, long accountAmount) {
        this.numberBankAccount = numberBankAccount;
        this.accountAmount = accountAmount;
        blockAccount = false;

    }

    public long getNumberBankAccount() {
        return numberBankAccount;
    }

    public void setNumberBankAccount(long numberBankAccount) {
        this.numberBankAccount = numberBankAccount;
    }

    public boolean isBlockAccount() {
        return blockAccount;
    }

    public void setBlockAccount(boolean blockAccount) {
        this.blockAccount = blockAccount;
    }

    public long getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(long accountAmount) {
        this.accountAmount = accountAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "nameBankAccount=" + numberBankAccount +
                ", blockAccount=" + blockAccount +
                ", accountAmount=" + accountAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return numberBankAccount == account.numberBankAccount &&
                blockAccount == account.blockAccount &&
                accountAmount == account.accountAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberBankAccount, blockAccount, accountAmount);
    }
}
