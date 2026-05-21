package com.practice.java8;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Practice: Stream pipeline — source → intermediate ops → terminal op.
 * TODO: distinct squares of even numbers; groupingBy length.
 */
public class StreamBasicsDemo {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 2, 4);

        List<Integer> evenSquares = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(evenSquares);

        long count = nums.stream().filter(n -> n > 2).count();
        System.out.println("count > 2: " + count);
    }
}
