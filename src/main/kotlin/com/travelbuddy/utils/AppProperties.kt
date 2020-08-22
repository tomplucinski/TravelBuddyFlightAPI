package com.travelbuddy.utils

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class AppProperties {
    @Value("\${rapidApiKey}")
    lateinit var rapidApiKey: String
}