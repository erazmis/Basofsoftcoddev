/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

package com.epam.module_4.aggregation_and_composition.task_5;

public class VoucherSet {

    private TravelVoucher[] vouchers;

    public VoucherSet(TravelVoucher ... vouchers) {
        this.vouchers = vouchers;
    }

    public VoucherSet() {
    }

    public VoucherSet selectByTypeOfTrip(String... types) {
        for (int i = 0; i < types.length; i++) {
            types[i] = types[i]
                    .replaceAll("\\W", "")
                    .strip()
                    .toUpperCase();
        }
        int number = 0;
        for (int i = 0; i < vouchers.length; i++) {
            if (contains(types, vouchers[i].getTypeOfTrip().name())) {
                number++;
            }
        }

        TravelVoucher[] selected = new TravelVoucher[number];
        int index = 0;
        for (int i = 0; i < vouchers.length; i++) {
            if (contains(types, vouchers[i].getTypeOfTrip().name())) {
                selected[index++] = vouchers[i];
            }
        }

        return new VoucherSet(selected);
    }

    public VoucherSet selectByTransport(String... transport) {
        for (int i = 0; i < transport.length; i++) {
            transport[i] = transport[i]
                    .replaceAll("\\W", "")
                    .strip()
                    .toUpperCase();
        }
        int number = 0;
        for (int i = 0; i < vouchers.length; i++) {
            if (contains(transport, vouchers[i].getTransport().name())) {
                number++;
            }
        }

        TravelVoucher[] selected = new TravelVoucher[number];
        int index = 0;
        for (int i = 0; i < vouchers.length; i++) {
            if (contains(transport, vouchers[i].getTransport().name())) {
                selected[index++] = vouchers[i];
            }
        }

        return new VoucherSet(selected);
    }

    public VoucherSet selectByTypeOfFood(String... types) {
        for (int i = 0; i < types.length; i++) {
            types[i] = types[i]
                    .replaceAll("\\W", "")
                    .strip()
                    .toUpperCase();
        }

        int number = 0;
        for (int i = 0; i < vouchers.length; i++) {
            if (contains(types, vouchers[i].getTypeOfFood().name())) {
                number++;
            }
        }

        TravelVoucher[] selected = new TravelVoucher[number];
        int index = 0;
        for (int i = 0; i < vouchers.length; i++) {
            if (contains(types, vouchers[i].getTypeOfFood().name())) {
                selected[index++] = vouchers[i];
            }
        }

        return new VoucherSet(selected);
    }

    public VoucherSet sortByTypeOfTrip(String ... types) {
        for (int i = 0; i < types.length; i++) {
            types[i] = types[i]
                    .replaceAll("\\W", "")
                    .strip()
                    .toUpperCase();
        }
        TravelVoucher buffer;

        for (int i = 1; i < vouchers.length; i++) {
            if (contains(types, vouchers[i].getTypeOfTrip().name()) && !contains(types, vouchers[i - 1].getTypeOfTrip().name())) {
                buffer = vouchers[i];
                vouchers[i] = vouchers[i - 1];
                vouchers[i - 1] = buffer;
                if (i > 1) {
                    i -= 2;
                }
            }
        }

        return new VoucherSet(vouchers);
    }

    public VoucherSet sortByTransport(String... transport) {
        for (int i = 0; i < transport.length; i++) {
            transport[i] = transport[i]
                    .replaceAll("\\W", "")
                    .strip()
                    .toUpperCase();
        }
        TravelVoucher buffer;

        for (int i = 1; i < vouchers.length; i++) {
            if (contains(transport, vouchers[i].getTransport().name()) && !contains(transport, vouchers[i - 1].getTransport().name())) {
                buffer = vouchers[i];
                vouchers[i] = vouchers[i - 1];
                vouchers[i - 1] = buffer;
                if (i > 1) {
                    i -= 2;
                }
            }
        }

        return new VoucherSet(vouchers);
    }

    public VoucherSet sortByDays() {
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

        return new VoucherSet(vouchers);
    }

    public VoucherSet sortByDays(int days) {
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

        return new VoucherSet(vouchers);
    }

    public VoucherSet sortByDays(int minimum, int maximum) {
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

        return new VoucherSet(vouchers);
    }

    public VoucherSet sortByTypeOfFood(String... types) {
        for (int i = 0; i < types.length; i++) {
            types[i] = types[i]
                    .replaceAll("\\W", "")
                    .strip()
                    .toUpperCase();
        }
        TravelVoucher buffer;

        for (int i = 1; i < vouchers.length; i++) {
            if (contains(types, vouchers[i].getTypeOfFood().name()) && !contains(types, vouchers[i - 1].getTypeOfFood().name())) {
                buffer = vouchers[i];
                vouchers[i] = vouchers[i - 1];
                vouchers[i - 1] = buffer;
                if (i > 1) {
                    i -= 2;
                }
            }
        }

        return new VoucherSet(vouchers);
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

    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < vouchers.length; i++) {
            str.append(vouchers[i].toString() + "\n\n");
        }

        return str.toString();
    }
}
