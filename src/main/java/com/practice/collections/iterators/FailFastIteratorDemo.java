package com.practice.collections.iterators;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/**
 * Practice: Fail-fast iterator — do not structurally modify collection during iteration.
 * TODO: Catch {@code ConcurrentModificationException}; fix with iterator.remove().
 */
public class FailFastIteratorDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        try {
            for (String s : list) {
                if ("b".equals(s)) {
                    list.remove(s); // triggers fail-fast
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Fail-fast: " + e.getClass().getSimpleName());
        }

        List<String> list2 = new ArrayList<>(List.of("a", "b", "c"));
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            if ("b".equals(it.next())) {
                it.remove(); // safe
            }
        }
        System.out.println(list2);
    }
}
