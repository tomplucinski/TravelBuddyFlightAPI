package com.travelbuddy.flightdata.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {

    @GetMapping("/hello")
    fun hello(): ResponseEntity<String>? {
        return ResponseEntity.ok("Hey there!")
    }

}