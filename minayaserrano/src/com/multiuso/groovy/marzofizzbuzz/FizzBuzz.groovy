package com.multiuso.groovy.marzofizzbuzz

class FizzBuzz {

    def say(number) {

        if (number % 3 == 0  && number % 5 == 0) {
            return 'FizzBuzz?'
        }

        if (number % 3 == 0 ) {
            return 'Fizz'
        }

        if (number % 5 == 0) {
                return 'Buzz'
        }
        
        return number
    }

    String toString() {
        for(i in 1..100) {
            println(say(i))
        }
    }
}
