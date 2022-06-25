package com.company;

public class Auto {

    String brand;
    String design;
    int price;
    double consumption;

    int minPrice = 600000;
    int maxPrice = 45000000;

    double minConsumption = 2.5;
    double maxConsumption = 15.0;

    MyRandomGenerator mrg = new MyRandomGenerator();

    public Auto() {
        this.brand = mrg.giveMeRandomCarBrand();
        this.design = mrg.giveMeRandomCarDesign();
        this.price = mrg.giveMeRandomIntNumberBetween(minPrice, maxPrice);
        this.consumption = mrg.giveMeRandomDoubleNumberBetween(minConsumption, maxConsumption);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", design='" + design + '\'' +
                ", price=" + price +
                ", consumption=" + consumption +
                '}';
    }
}