/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

package com.epam.module_4.aggregation_and_composition.task_5;

public class TravelVoucher {

    private String type;
    private String transport;
    private String typeOfFood;
    private int days;

    public TravelVoucher() {
    }

    public TravelVoucher(String type, String transport, String formOfFood, int days) {
        this.type = type;
        this.transport = transport;
        this.typeOfFood = formOfFood;
        this.days = days;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
