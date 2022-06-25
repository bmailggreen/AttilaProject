package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Auto> randomAutoList = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {
            randomAutoList.add(new Auto());
        }

        for (Auto auto : randomAutoList) {
            System.out.println(auto);
        }

        print(randomAutoList, element -> element.compareTo(3) < 0);
    }

    public static void print(List<Auto> randomCarList, Condition condition) {
        for (Auto element : randomCarList) {
            if (condition.condition(element.consumption)) {
                System.out.println(element);
            }
        }
    }

}
