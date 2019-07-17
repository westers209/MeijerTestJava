package com.example.meijertestjava;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class ListOfCoupon {
    @SerializedName("isClipped")
    @Expose
    private Boolean isClipped;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("imageURL")
    @Expose
    private String imageURL;
    @SerializedName("redemptionEndDate")
    @Expose
    private String redemptionEndDate;

    public Boolean getClipped() {
        return isClipped;
    }

    public void setClipped(Boolean clipped) {
        isClipped = clipped;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getRedemptionEndDate() {
        return redemptionEndDate;
    }

    public void setRedemptionEndDate(String redemptionEndDate) {
        this.redemptionEndDate = redemptionEndDate;
    }
}
