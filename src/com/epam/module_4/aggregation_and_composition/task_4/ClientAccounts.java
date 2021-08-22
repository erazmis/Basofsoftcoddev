/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

package com.epam.module_4.aggregation_and_composition.task_4;

public class ClientAccounts {

    public static void sortAccountsBySum(Account... accounts) {
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

    public static long totalAmount(Account... accounts) {
        long amount = 0;

        for (int i = 0; i < accounts.length; i++) {
            if (!accounts[i].isBlocked()) {
                amount += accounts[i].getSum();
            }
        }

        return amount;
    }

    public static long negativeAmount(Account... accounts) {
        long amount = 0;

        for (int i = 0; i < accounts.length; i++) {
            if (!accounts[i].isBlocked() && accounts[i].getSum() < 0) {
                amount += accounts[i].getSum();
            }
        }

        return amount;
    }

    public static long positiveAmount(Account... accounts) {
        long amount = 0;

        for (int i = 0; i < accounts.length; i++) {
            if (!accounts[i].isBlocked() && accounts[i].getSum() > 0) {
                amount += accounts[i].getSum();
            }
        }

        return amount;
    }

    public static Account getAccountByNumber(int number, Account... accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNumber() == number) {
                return accounts[i];
            }
        }
        return null;
    }

    public static void blockAccount(int number) {
        getAccountByNumber(number).setBlocked(true);
    }

    public static void unblockAccount(int number) {
        getAccountByNumber(number).setBlocked(false);
    }
}
