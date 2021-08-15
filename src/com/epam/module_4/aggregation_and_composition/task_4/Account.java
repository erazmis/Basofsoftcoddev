/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

package com.epam.module_4.aggregation_and_composition.task_4;

public class Account {

    private boolean isBlocked;
    private int sum;
    private int accountNumber;

    public Account() {
    }

    public Account(boolean isBlocked, int sum, int accountNumber) {
        this.isBlocked = isBlocked;
        this.sum = sum;
        this.accountNumber = accountNumber;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String toString() {
        String status;
        if (isBlocked) {
            status = "blocked";
        } else {
            status = "not blocked";
        }
        return "Account number: " + accountNumber +
                "\nStatus: " + status +
                "\nSum: " + sum;
    }
}
