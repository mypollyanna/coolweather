package com.coolweather.zsyweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond_txt")
    public String description;

    @SerializedName("hum")
    public String humidity;

    @SerializedName("pres")
    public String pressure;
}
