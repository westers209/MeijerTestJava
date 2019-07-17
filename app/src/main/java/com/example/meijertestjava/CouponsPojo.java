package com.example.meijertestjava;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

class CouponsPojo {
    @SerializedName("couponCount")
    @Expose
    private Integer couponCount;
    @SerializedName("availableCouponCount")
    @Expose
    private Integer availableCouponCount;
    @SerializedName("listOfCoupons")
    @Expose
    private ArrayList<ListOfCoupon> listOfCoupons;

    public Integer getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    public Integer getAvailableCouponCount() {
        return availableCouponCount;
    }

    public void setAvailableCouponCount(Integer availableCouponCount) {
        this.availableCouponCount = availableCouponCount;
    }

    public ArrayList<ListOfCoupon> getListOfCoupons() {
        return listOfCoupons;
    }

    public void setListOfCoupons(ArrayList<ListOfCoupon> listOfCoupons) {
        this.listOfCoupons = listOfCoupons;
    }
}
