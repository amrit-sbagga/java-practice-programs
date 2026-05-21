package com.practice.java8;

import java.util.Comparator;
import java.util.List;

/**
 * Practice: Lambda syntax — (params) -> expression / block.
 * TODO: Sort list of names by length; replace anonymous Runnable with lambda.
 */
public class LambdaExpressionDemo {

    public static void main(String[] args) {
        List<String> names = List.of("Amy", "Bob", "Calvin");

        // Anonymous class (pre-Java 8 style)
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        });

        // Lambda equivalent — implement in a second exercise:
        // names.sort((a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println(names);
    }
}
