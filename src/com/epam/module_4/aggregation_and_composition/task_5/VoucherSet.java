/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

package com.epam.module_4.aggregation_and_composition.task_5;

public class VoucherSet {

    TravelVoucher[] vouchers;

    public VoucherSet(TravelVoucher[] vouchers) {
        this.vouchers = vouchers;
    }

    public VoucherSet() {
    }

    public TravelVoucher[] selectByType(String... type) {
        int number = 0;
        for (int i = 0; i < vouchers.length; i++) {
            if (contains(type, vouchers[i].getType())) {
                number++;
            }
        }

        TravelVoucher[] selected = new TravelVoucher[number];
        int index = 0;
        for (int i = 0; i < vouchers.length; i++) {
            if (contains(type, vouchers[i].getType())) {
                selected[index++] = vouchers[i];
            }
        }

        return selected;
    }

    public TravelVoucher[] selectByTransport(String... transport) {
        int number = 0;
        for (int i = 0; i < vouchers.length; i++) {
            if (contains(transport, vouchers[i].getTransport())) {
                number++;
            }
        }

        TravelVoucher[] selected = new TravelVoucher[number];
        int index = 0;
        for (int i = 0; i < vouchers.length; i++) {
            if (contains(transport, vouchers[i].getTransport())) {
                selected[index++] = vouchers[i];
            }
        }

        return selected;
    }

    public TravelVoucher[] selectByTypeOfFood(String... type) {
        int number = 0;
        for (int i = 0; i < vouchers.length; i++) {
            if (contains(type, vouchers[i].getType())) {
                number++;
            }
        }

        TravelVoucher[] selected = new TravelVoucher[number];
        int index = 0;
        for (int i = 0; i < vouchers.length; i++) {
            if (contains(type, vouchers[i].getType())) {
                selected[index++] = vouchers[i];
            }
        }

        return selected;
    }

    public void sortByTransport(String... transport) {
        TravelVoucher buffer;

        for (int i = 1; i < vouchers.length; i++) {
            if (contains(transport, vouchers[i].getTransport()) && !contains(transport, vouchers[i - 1].getTransport())) {
                buffer = vouchers[i];
                vouchers[i] = vouchers[i - 1];
                vouchers[i - 1] = buffer;
                if (i > 1) {
                    i -= 2;
                }
            }
        }
    }

    public void sortByDays() {
        TravelVoucher buffer;

        for (int i = 1; i < vouchers.length; i++) {
            if (vouchers[i].getDays() < vouchers[i - 1].getDays()) {
                buffer = vouchers[i];
                vouchers[i] = vouchers[i - 1];
                vouchers[i - 1] = buffer;
                if (i > 1) {
                    i -= 2;
                }
            }
        }
    }

    public void sortByDays(int days) {
        TravelVoucher buffer;

        for (int i = 1; i < vouchers.length; i++) {
            if (vouchers[i].getDays() == days && vouchers[i - 1].getDays() != days) {
                buffer = vouchers[i];
                vouchers[i] = vouchers[i - 1];
                vouchers[i - 1] = buffer;
                if (i > 1) {
                    i -= 2;
                }
            }
        }
    }

    public void sortByDays(int minimum, int maximum) {
        TravelVoucher buffer;

        for (int i = 1; i < vouchers.length; i++) {
            if ((vouchers[i].getDays() >= minimum && vouchers[i].getDays() <= maximum) && (vouchers[i - 1].getDays() < minimum || vouchers[i - 1].getDays() > maximum)) {
                buffer = vouchers[i];
                vouchers[i] = vouchers[i - 1];
                vouchers[i - 1] = buffer;
                if (i > 1) {
                    i -= 2;
                }
            }
        }

        for (int i = 1; i < vouchers.length; i++) {
            if (vouchers[i].getDays() > vouchers[i - 1].getDays() && vouchers[i].getDays() <= maximum) {
                buffer = vouchers[i];
                vouchers[i] = vouchers[i - 1];
                vouchers[i - 1] = buffer;
                if (i > 1) {
                    i -= 2;
                }
            } else if (vouchers[i].getDays() > maximum || vouchers[i].getDays() < minimum) {
                break;
            }
        }
    }

    public void sortByTypeOfFood(String... type) {
        TravelVoucher buffer;

        for (int i = 1; i < vouchers.length; i++) {
            if (contains(type, vouchers[i].getType()) && !contains(type, vouchers[i - 1].getType())) {
                buffer = vouchers[i];
                vouchers[i] = vouchers[i - 1];
                vouchers[i - 1] = buffer;
                if (i > 1) {
                    i -= 2;
                }
            }
        }
    }

    private boolean contains(String[] strings, String element) {
        boolean answer = false;

        for (String str : strings) {
            if (str.equalsIgnoreCase(element)) {
                answer = true;
                break;
            }
        }

        return answer;
    }
    // toString
}
