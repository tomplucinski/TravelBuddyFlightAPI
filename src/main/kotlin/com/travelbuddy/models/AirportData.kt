package com.travelbuddy.models

import lombok.Data

@Data
class AirportData (
        var placeId: String,
        var placeName: String,
        var countryId: String,
        var regionId: String,
        var cityId: String,
        var countryName: String
)