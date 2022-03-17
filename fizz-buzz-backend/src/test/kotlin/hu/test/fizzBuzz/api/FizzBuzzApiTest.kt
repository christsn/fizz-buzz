package hu.test.fizzBuzz.api

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FailedRequestApiTest {

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    private val API_ENDPOINT = "/fizz-buzz"

    @Test
    fun getFizzBuzzValues() {
        val result = restTemplate.getForEntity(API_ENDPOINT, List::class.java);

        assertNotNull(result)
        assertEquals(HttpStatus.OK, result?.statusCode)
    }
}