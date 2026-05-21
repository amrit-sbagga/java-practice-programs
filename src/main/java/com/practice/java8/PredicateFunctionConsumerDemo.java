package com.practice.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Practice: Core functional interfaces — test, transform, consume, supply.
 * TODO: Chain Predicate with {@code and}/{@code or}; compose Function with {@code andThen}.
 */
public class PredicateFunctionConsumerDemo {

    public static void main(String[] args) {
        Predicate<String> nonEmpty = s -> s != null && !s.isBlank();
        Function<String, Integer> length = String::length;
        Consumer<String> print = System.out::println;
        Supplier<Double> random = Math::random;

        String input = "lambda";
        if (nonEmpty.test(input)) {
            print.accept("length = " + length.apply(input));
        }
        print.accept("random = " + random.get());
    }
}
