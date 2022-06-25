package com.company;

public interface Condition <T extends Comparable<T>> {
    public boolean condition(T element);
}
