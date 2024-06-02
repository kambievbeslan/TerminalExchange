package com.beslan.terminalexchange.data

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiExchange {

    @GET("aggs/ticker/MSFT/range/{timeframe}/2023-01-01/2024-01-01?adjusted=true&sort=desc&limit=50000")
    suspend fun loadBars(
        @Path("timeframe") timeFrame: String
    ): Result

}