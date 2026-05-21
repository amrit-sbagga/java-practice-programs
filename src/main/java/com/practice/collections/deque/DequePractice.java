package com.practice.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Practice: ArrayDeque — offer/poll both ends; sliding window; BFS queue.
 * TODO: Check palindrome using Deque; valid parentheses with stack behavior.
 */
public class DequePractice {

    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(1);
        dq.offerLast(2);
        dq.offerFirst(0);
        System.out.println(dq);
        System.out.println("pollFirst: " + dq.pollFirst());
        System.out.println("pollLast: " + dq.pollLast());
    }
}
