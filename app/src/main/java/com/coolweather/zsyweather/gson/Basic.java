package com.coolweather.zsyweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("cid")
    public String weatherId;

    @SerializedName("location")
    public String cityName;
}
