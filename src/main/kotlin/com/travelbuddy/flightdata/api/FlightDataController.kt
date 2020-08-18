package com.travelbuddy.flightdata.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import com.travelbuddy.utils.Constants

@RestController
class FlightDataController {

    @GetMapping("/getairports")
    fun getAirportData(): ResponseEntity<String>? {

        val client = HttpClient.newBuilder().build();
        val request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("%s%s", Constants.AIRPORT_DATA, "USA/USD/en-US/?query=chicago")))
                .setHeader("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
                .setHeader("x-rapidapi-key", "f3edbe9de8msh4eb2a36537f385cp1a756ejsn3027ab0bd3d2")
                .setHeader("Content-Type", "application/json")
                .build();
        val response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return ResponseEntity.ok(response.body().toString())
    }

}