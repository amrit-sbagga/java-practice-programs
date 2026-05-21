package com.practice.java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Practice: BiFunction, BinaryOperator (BiFunction specialization), UnaryOperator.
 * TODO: Use BiPredicate; map with Function then filter with Predicate.
 */
public class BiFunctionUnaryOperatorDemo {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        BinaryOperator<Integer> max = Integer::max;
        UnaryOperator<String> trimUpper = s -> s.trim().toUpperCase();

        System.out.println(multiply.apply(6, 7));
        System.out.println(max.apply(10, 20));
        System.out.println(trimUpper.apply("  lambda  "));
    }
}
