package com.practice.collections.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Practice: TreeSet — sorted, ceiling/floor, custom Comparator.
 * TODO: Store Employee by salary; range query [low, high].
 */
public class TreeSetPractice {

    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(20);
        System.out.println(set);
        System.out.println("ceiling(7): " + set.ceiling(7));
        System.out.println("floor(7): " + set.floor(7));
    }
}
