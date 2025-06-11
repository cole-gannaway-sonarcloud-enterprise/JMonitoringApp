package org.owasp.benchmark.helpers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Thing2Test {
    @Test
    void testDoSomething_withNullInput() {
        Thing2 thing = new Thing2();
        String result = thing.doSomething(null);
        assertEquals("", result, "Should return empty string for null input");
    }

    @Test
    void testDoSomething_withEmptyString() {
        Thing2 thing = new Thing2();
        String result = thing.doSomething("");
        assertEquals("", result, "Should return empty string for empty input");
    }

    @Test
    void testDoSomething_withNormalString() {
        Thing2 thing = new Thing2();
        String input = "test";
        String result = thing.doSomething(input);
        assertEquals(input, result, "Should return the same string as input");
    }

    @Test
    void testDoSomething_basicCases() {
        Thing2 thing = new Thing2();
        assertEquals("", thing.doSomething(null), "Should return empty string for null input");
        assertEquals("", thing.doSomething(""), "Should return empty string for empty input");
        assertEquals("abc", thing.doSomething("abc"), "Should return the same string as input");
    }
}
