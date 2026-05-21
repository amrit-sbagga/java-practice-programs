package com.practice.java7;

import java.util.ArrayList;
import java.util.List;

/**
 * Practice: Diamond operator {@code <>} — type inference on RHS.
 */
public class DiamondOperatorDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("7+");
        names.forEach(System.out::println);
    }
}
