package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MyRandomGenerator {

    Random random = new Random();

    Set<String> carBrands = new HashSet<>(Arrays.asList("Volkswagen", "Peugeot", "Dacia", "Renault", "Toyota", "Opel", "Fiat",
                                                                "Citroen", "Hyundai", "Skoda", "Tesla", "Ford", "Volvo", "Mercedes", "Audi", "BMW"));
    String[] carBrandsInArray = carBrands.toArray(new String[0]);

    Set<String> carDesigns = new HashSet<>(Arrays.asList("Sedan", "Pick-up", "Minivan", "Hatchback", "Convertible",
                                                                 "Coupe", "SUV", "MPV", "Micro", "Van", "Mini Truck"));
    String[] carDesignsInArray = carDesigns.toArray(new String[0]);


    public String giveMeRandomCarBrand() {
        return carBrandsInArray[random.nextInt(carBrandsInArray.length)];
    }

    public String giveMeRandomCarDesign() {
        return carDesignsInArray[random.nextInt(carDesignsInArray.length)];
    }


    public int giveMeRandomIntNumberBetween(int min, int max)	{
        return random.nextInt(max - min) + min;
    }

    public double giveMeRandomDoubleNumberBetween(double min, double max) {
        return random.nextDouble(max - min) + min;
    }
}