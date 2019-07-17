package com.example.meijertestjava;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CouponApi {
//https://meijerkraig.azurewebsites.net/api/Products?code=34lgBae%2FxIEnqksQpkn3w9F0JTKCafuiCr0ejLNLvBzlOlOZBa1CMA%3D%3D

    @GET("api/Products?code=34lgBae%2FxIEnqksQpkn3w9F0JTKCafuiCr0ejLNLvBzlOlOZBa1CMA%3D%3D")
    Call<CouponsPojo> getCoupons();
}
