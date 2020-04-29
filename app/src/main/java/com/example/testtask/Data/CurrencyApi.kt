package com.example.testtask.Data

import retrofit2.Call
import retrofit2.http.GET

interface CurrencyApi {

    @GET("daily_json.js")
    fun getCurrency(): Call<Currency>
}