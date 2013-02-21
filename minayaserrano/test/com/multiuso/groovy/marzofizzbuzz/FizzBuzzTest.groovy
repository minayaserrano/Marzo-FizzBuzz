package com.multiuso.groovy.marzofizzbuzz

import groovy.util.GroovyTestCase
import com.multiuso.groovy.marzofizzbuzz.FizzBuzz

class FizzBuzzTest extends GroovyTestCase {
    void testFramework() {
        assertTrue(true)
    }

    void testOneSayOne() {
        def expected = 1
        def actual   = new FizzBuzz();

        assertEquals(expected, actual.say(1))
    }

    void testTwoSayTwo() {
        
        assertEquals(2, new FizzBuzz().say(2))
    }
}
