package com.practice.collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Practice: HashSet — uniqueness, add/contains, set operations.
 * TODO: Union and intersection of two sets; remove duplicates from list.
 */
public class HashSetPractice {

    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> b = new HashSet<>(Set.of(2, 3, 4));
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("union: " + union);
    }
}
