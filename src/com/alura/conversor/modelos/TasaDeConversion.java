package com.alura.conversor.modelos;

import com.google.gson.annotations.SerializedName;

public record TasaDeConversion(
        @SerializedName("conversion_rate") double conversionRate
) {
}
