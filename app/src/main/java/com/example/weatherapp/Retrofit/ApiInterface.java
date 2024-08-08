package com.example.weatherapp.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("weather?appid=ca812e1e0c317da73d06fb81da44e1d1&units=metric")
    Call<Example> getWeatherData(@Query("q") String name);
}
