package com.practice.java8;

import java.util.List;
import java.util.Optional;

/**
 * Practice: reduce, min/max, joining; Optional from findFirst/findAny.
 * TODO: Product of list; flatMap list of lists into one stream.
 */
public class StreamReduceCollectDemo {

    public static void main(String[] args) {
        List<Integer> nums = List.of(3, 1, 4, 1, 5);

        int sum = nums.stream().reduce(0, Integer::sum);
        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        String joined = nums.stream()
                .map(String::valueOf)
                .reduce((a, b) -> a + "," + b)
                .orElse("");

        System.out.println("sum=" + sum);
        System.out.println("max=" + max.orElse(-1));
        System.out.println("joined=" + joined);
    }
}
