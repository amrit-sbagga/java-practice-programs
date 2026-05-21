package com.practice.java8;

import java.util.Optional;

/**
 * Practice: Optional — avoid null; map, flatMap, orElse, orElseGet, ifPresent.
 * TODO: Find first name starting with "Z" from a list using stream + Optional.
 */
public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> present = Optional.of("java8");
        Optional<String> empty = Optional.empty();

        System.out.println(present.map(String::toUpperCase).orElse("N/A"));
        System.out.println(empty.orElseGet(() -> "default"));

        present.ifPresent(v -> System.out.println("value: " + v));

        // TODO: Optional.ofNullable(null) — when to use vs of()
    }
}
