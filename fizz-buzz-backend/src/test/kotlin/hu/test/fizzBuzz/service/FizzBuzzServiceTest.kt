package hu.test.fizzBuzz.service

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FizzBuzzServiceTest {

    private val testService: FizzBuzzService = FizzBuzzService()

    @Test
    fun testGetFizzBuzzValues() {
        val expectedSize = 100

        val fizzBuzzValues = testService.getFizzBuzzValues()

        assertEquals(expectedSize, fizzBuzzValues.size)
        assertEquals(1, fizzBuzzValues[0])
        assertEquals("Fizz", fizzBuzzValues[2])
        assertEquals("Buzz", fizzBuzzValues[4])
        assertEquals("FizzBuzz", fizzBuzzValues[14])
        assertEquals(77, fizzBuzzValues[76])
        assertEquals("Buzz", fizzBuzzValues[99])
    }
}