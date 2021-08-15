/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

package com.epam.module_4.aggregation_and_composition.task_4;

public class ClientAccounts {

    Account[] accounts;

    public void sortAccountsBySum(Account[] accounts) {
        int buffer;
        for (int i = 1; i < accounts.length; i++) {
            if (accounts[i].getSum() < accounts[i - 1].getSum()) {
                buffer = accounts[i].getSum();
                accounts[i].setSum(accounts[i - 1].getSum());
                accounts[i - 1].setSum(buffer);
                if (i > 1) {
                    i -= 2;
                }
            }
        }
    }

    public long totalAmount() {
        long amount = 0;

        for (int i = 0; i < accounts.length; i++) {
            if (!accounts[i].isBlocked()) {
                amount += accounts[i].getSum();
            }
        }

        return amount;
    }

    public long negativeAmount() {
        long amount = 0;

        for (int i = 0; i < accounts.length; i++) {
            if (!accounts[i].isBlocked() && accounts[i].getSum() < 0) {
                amount += accounts[i].getSum();
            }
        }

        return amount;
    }

    public long positiveAmount() {
        long amount = 0;

        for (int i = 0; i < accounts.length; i++) {
            if (!accounts[i].isBlocked() && accounts[i].getSum() > 0) {
                amount += accounts[i].getSum();
            }
        }

        return amount;
    }

    public Account getAccountByNumber(int number) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNumber() == number) {
                return accounts[i];
            }
        }
        return new Account();
    }

    public void blockAccount(int number) {
        Account account = getAccountByNumber(number);
        account.setBlocked(true);
    }

    public void unblockAccount(int number) {
        Account account = getAccountByNumber(number);
        account.setBlocked(false);
    }
}
