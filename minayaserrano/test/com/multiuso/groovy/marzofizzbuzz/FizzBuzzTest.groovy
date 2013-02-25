package com.multiuso.groovy.marzofizzbuzz

import groovy.util.GroovyTestCase
import com.multiuso.groovy.marzofizzbuzz.FizzBuzz

class FizzBuzzTest extends GroovyTestCase {

    def fizzBuzz = new FizzBuzz()
    def values = [  1 : 1,
                    2 : 2,
                    3 : 'Fizz',
                    4 : 4,
                    5 : 'Buzz',
                    6 : 'Fizz',
                    7 : 7,
                    15: 'FizzBuzz?',
                    31: 'Fizz',
                    35: 'FizzBuzz?',
                    43: 'Fizz',
                    45: 'FizzBuzz?',
                    51: 'FizzBuzz?',
                    52: 'Buzz',
                    53: 'FizzBuzz?',
                    54: 'FizzBuzz?'
                 ]

    void testFramework() {
        assertTrue(true)
    }

    void testAllSayTheCorrect() {
        
        values.keySet().each( {
            assertEquals(values[it], fizzBuzz.say(it))
        })
    }

}
