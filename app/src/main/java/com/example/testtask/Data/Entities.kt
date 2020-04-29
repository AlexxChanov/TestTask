package com.example.testtask.Data

import com.google.gson.annotations.SerializedName

data class Currency(
 @SerializedName("Valute") val valute:Valute
)

data class Valute(
    @SerializedName("USD")val usd: Usd
)
data class Usd(
    @SerializedName("Value")val value: Double,
    @SerializedName("NumCode")val code: Int

)