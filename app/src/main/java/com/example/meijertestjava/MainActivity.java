package com.example.meijertestjava;

import android.app.ProgressDialog;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private CouponAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<ListOfCoupon> data;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CouponApi couponApi = NetworkConnection.getApiService();

        Call<CouponsPojo> call = couponApi.getCoupons();

        call.enqueue(new Callback<CouponsPojo>() {
            @Override
            public void onResponse(Call<CouponsPojo> call, Response<CouponsPojo> response) {
                data = response.body().getListOfCoupons();
                recyclerView = findViewById(R.id.recyclerView);
                adapter = new CouponAdapter(data);
                RecyclerView.LayoutManager eLayoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(eLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<CouponsPojo> call, Throwable t) {

            }
        });
    }

}