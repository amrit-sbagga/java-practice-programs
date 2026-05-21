package com.practice.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Practice: HashMap — put/get, frequency count, containsKey.
 * TODO: Char frequency of a string; two-sum indices.
 */
public class HashMapPractice {

    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<>();
        for (char c : "hello".toCharArray()) {
            String key = String.valueOf(c);
            freq.merge(key, 1, Integer::sum);
        }
        System.out.println(freq);
    }
}
