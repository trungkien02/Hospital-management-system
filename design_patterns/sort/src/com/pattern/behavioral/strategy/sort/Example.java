package com.pattern.behavioral.strategy.sort;
public class Example {

    public static void main(String[] args) {

        Sorted_List sortedList = new Sorted_List();
        sortedList.add("Java Core");
        sortedList.add("Java Design Pattern");
        sortedList.add("Java Library");
        sortedList.add("Java Framework");

        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}

