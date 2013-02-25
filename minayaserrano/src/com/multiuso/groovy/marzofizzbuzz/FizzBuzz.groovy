package com.multiuso.groovy.marzofizzbuzz


class FizzBuzz {

    def say(number) {

        if ((number % 3 == 0 && number % 5 == 0) ||
            (number % 3 == 0 && number ==~ /\d*5\d*/) ||
            (number % 5 == 0 && number ==~ /\d*3\d*/) ||
            (number ==~ /\d*3\d*/ && number ==~ /\d*5\d*/)) {
            return 'FizzBuzz?'
        }

        if (number % 3 == 0 || number ==~ /\d*3\d*/) {
            return 'Fizz'
        }

        if (number % 5 == 0 || number ==~ /\d*5\d*/) {
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
