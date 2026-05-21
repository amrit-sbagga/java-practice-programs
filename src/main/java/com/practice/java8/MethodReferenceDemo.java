package com.practice.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Practice: Method references — static, instance, arbitrary instance, constructor.
 * Forms: Class::staticMethod, instance::method, Class::instanceMethod, Class::new
 */
public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "8", "lambda");

        // Instance method on arbitrary object: String::compareToIgnoreCase
        words.sort(String::compareToIgnoreCase);
        words.forEach(System.out::println);

        // Static method reference
        words.stream().map(String::toUpperCase).forEach(System.out::println);

        // Constructor reference — TODO: map strings to StringBuilder via StringBuilder::new
    }
}
