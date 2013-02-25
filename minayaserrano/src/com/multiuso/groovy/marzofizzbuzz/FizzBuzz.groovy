package com.multiuso.groovy.marzofizzbuzz


class FizzBuzz {

    def say(number) {

        if ((multiple(number, 3) && multiple(number, 5)) ||
            (multiple(number, 3) && contains(number, 5)) ||
            (multiple(number, 5) && contains(number, 3)) ||
            (contains(number, 3) && contains(number, 5))) {
            return 'FizzBuzz?'
        }

        if (multiple(number, 3) || contains(number, 3)) {
            return 'Fizz'
        }

        if (multiple(number, 5) || contains(number, 5)) {
            return 'Buzz'
        }
        
        return number
    }

    def multiple(number, multiple) {
        
        return number % multiple == 0
    }

    def contains(number, contain) {

        return number ==~ /\d*${contain}\d*/
    }

    String toString() {
        for(i in 1..100) {
            println(say(i))
        }
    }
}
