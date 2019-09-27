package com.paysera.sdk.wallet.entities.pos;

public class PlaceInfo {
    private String title;
    private String description;
    private String address;
    private Integer locationId;
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

    public Integer getLocationId() {
        return locationId;
    }

    public String getLogoUri() {
        return logoUri;
    }

    public String getPlaceDetails() {
        return description + "\n" + address;
    }
}