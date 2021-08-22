package com.epam.module_4.aggregation_and_composition.task_5;

public class Main {

    public static void main(String[] args) {
        TravelVoucher tour1 = new TravelVoucher("rest", "airplane", "ultraallinclusive", 12);
        TravelVoucher tour2 = new TravelVoucher(" rest", "airplane", "allinclusive", 11);
        TravelVoucher tour3 = new TravelVoucher("rest ", "bus", "fullboard", 14);
        TravelVoucher tour4 = new TravelVoucher("excursion", "bus", "half-board", 5);
        TravelVoucher tour5 = new TravelVoucher("cruise", "Cruise ship", "ultra all inclusive", 21);
        TravelVoucher tour6 = new TravelVoucher("cRuise ", "cruise SHIP", "allinclusive", 14);

        VoucherSet set = new VoucherSet(tour1, tour2, tour3, tour4, tour5, tour6);
        System.out.println("All vouchers:\n\n" + set + "*".repeat(24));
        System.out.println("Sorted by transport (bus):\n\n" + set.sortByTransport("bus") + "*".repeat(24));
        System.out.println("Selected by transport (cruise ship):\n\n" + set.selectByTransport("cruiseship") + "*".repeat(24));
        System.out.println("Sorted by type of trip (rest):\n\n" + set.sortByTypeOfTrip("rest") + "*".repeat(24));
        System.out.println("Selected by type of trip (rest) and days (from 12 to 21) (vouchers with irrelevant days after relevant)\n\n" +
                set.sortByDays(12, 21).selectByTypeOfTrip("rest") + "*".repeat(24));
        System.out.println("Selected by type of food (all-inclusive and ultra all-inclusive) and sorted by days (ascending):\n\n" +
                set.sortByDays().selectByTypeOfFood("allinclusive", "ultra all inclusive") + "*".repeat(24));
    }
}
