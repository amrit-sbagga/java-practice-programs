package com.practice.collections.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * Practice: Stack via Deque — classic interview: valid parentheses.
 */
public class ValidParenthesesDemo {

    public static boolean isValid(String s) {
        Map<Character, Character> pairs = Map.of(')', '(', ']', '[', '}', '{');
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (pairs.containsValue(c)) {
                stack.push(c);
            } else if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));       // false
    }
}
