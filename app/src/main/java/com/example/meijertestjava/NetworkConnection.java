package com.example.meijertestjava;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkConnection {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://meijerkraig.azurewebsites.net/";

    public static Retrofit getRetrofit(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static CouponApi getApiService() {
        return getRetrofit().create(CouponApi.class);
    }
}
