/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

package com.epam.module_4.aggregation_and_composition.task_5;

public class TravelVoucher {

    private TypeOfTrip typeOfTrip;
    private TypeOfTransport transport;
    private TypeOfFood typeOfFood;
    private int days;

    public TravelVoucher(String typeOfTrip, String transport, String typeOfFood, int days) {
        this.typeOfTrip = TypeOfTrip.valueOf(typeOfTrip
                .replaceAll("\\W", "")
                .strip()
                .toUpperCase());
        this.transport = TypeOfTransport.valueOf(transport
                .replaceAll("\\W", "")
                .strip()
                .toUpperCase());
        this.typeOfFood = TypeOfFood.valueOf(typeOfFood
                .replaceAll("\\W", "")
                .strip()
                .toUpperCase());
        this.days = days;
    }

    public TypeOfTrip getTypeOfTrip() {
        return typeOfTrip;
    }

    public void setTypeOfTrip(TypeOfTrip typeOfTrip) {
        this.typeOfTrip = typeOfTrip;
    }

    public TypeOfTransport getTransport() {
        return transport;
    }

    public void setTransport(TypeOfTransport transport) {
        this.transport = transport;
    }

    public TypeOfFood getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(TypeOfFood typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String toString() {
        return "Voucher type: " + typeOfTrip +
                "\nDays: " + days +
                "\nTransport: " + transport +
                "\ntypeOfFood: " + typeOfFood;
    }
}

enum TypeOfFood {
    BREAKFASTONLY,
    HALFBOARD,
    HALFBOARDPLUS,
    FULLBOARD,
    FULLBOARDPLUS,
    ALLINCLUSIVE,
    ULTRAALLINCLUSIVE
}

enum TypeOfTransport {
    TRAIN,
    AIRPLANE,
    BUS,
    BICYCLE,
    SHIP,
    CRUISESHIP
}

enum TypeOfTrip {
    REST,
    EXCURSION,
    RECOVERY,
    TREATMENT,
    SHOPPING,
    CRUISE
}