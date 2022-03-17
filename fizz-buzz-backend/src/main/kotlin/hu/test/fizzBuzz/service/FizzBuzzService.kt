package hu.test.fizzBuzz.service

import org.springframework.stereotype.Service

@Service
class FizzBuzzService {

    companion object {
        const val END_RANGE = 100
    }

    fun getFizzBuzzValues(): List<Any> {
        return (1..END_RANGE).map {
            when {
                it % 15 == 0 -> "FizzBuzz"
                it % 5 == 0 -> "Buzz"
                it % 3 == 0 -> "Fizz"
                else -> it
            }
        }
    }
}