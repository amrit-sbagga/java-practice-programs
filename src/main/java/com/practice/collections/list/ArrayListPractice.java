package com.practice.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Practice: ArrayList — add/remove, index, subList, sort.
 * TODO: Reverse list in-place; find first duplicate.
 */
public class ArrayListPractice {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(3, 1, 4, 1, 5));
        Collections.sort(nums);
        System.out.println(nums);
    }
}
