package com.paysera.sdk.wallet.entities.pos;

import com.google.gson.annotations.SerializedName;

public class PlaceInfo {
    private String title;
    private String description;
    private String address;
    @SerializedName("location_id")
    private int locationId;
    @SerializedName("logo_uri")
    private String logoUri;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public int getLocationId() {
        return locationId;
    }

    public String getLogoUri() {
        return logoUri;
    }

    public String details() {
        return description + "\n" + address;
    }
}