package com.practice.collections.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Practice: {@code Comparable} (natural order) vs {@code Comparator} (custom).
 */
public class ComparableComparatorDemo {

    record Student(String name, int score) {
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Amy", 85),
                new Student("Bob", 92),
                new Student("Cal", 78)
        ));
        students.sort(Comparator.comparingInt(Student::score).reversed());
        students.forEach(System.out::println);
    }
}
