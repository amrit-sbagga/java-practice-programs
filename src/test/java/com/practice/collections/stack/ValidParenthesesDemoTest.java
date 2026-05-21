package com.practice.collections.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesDemoTest {

    @Test
    void validCases() {
        assertTrue(ValidParenthesesDemo.isValid(""));
        assertTrue(ValidParenthesesDemo.isValid("()[]{}"));
        assertTrue(ValidParenthesesDemo.isValid("{[()]}"));
    }

    @Test
    void invalidCases() {
        assertFalse(ValidParenthesesDemo.isValid("(]"));
        assertFalse(ValidParenthesesDemo.isValid("([)]"));
    }
}
