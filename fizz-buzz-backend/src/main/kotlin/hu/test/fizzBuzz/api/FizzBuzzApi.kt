package hu.test.fizzBuzz.api

import hu.test.fizzBuzz.service.FizzBuzzService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Tag(name = "FizzBuzz API", description = "Endpoint for FizzBuzz calculation")
class FizzBuzzApi(val fizzBuzzService: FizzBuzzService)  {

    @Operation(summary = "Endpoint for the FizzBuzz values")
    @GetMapping("/fizz-buzz")
    fun getFizzBuzzValues(): List<Any> {
        return fizzBuzzService.getFizzBuzzValues()
    }
}