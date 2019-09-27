package com.paysera.sdk.wallet.entities.pos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Spot {
    private long id;
    @SerializedName("status")
    private Status status;
    private String identifier;
    @SerializedName("place_info")
    private PlaceInfo placeInfo;
    private List<Order> orders;

    public long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getIdentifier() {
        return identifier;
    }

    public PlaceInfo getPlaceInfo() {
        return placeInfo;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Order> getPendingOrders() {
        List<Order> pendingOrders = new ArrayList<>();
        for (Order order : this.orders) {
            if (order.getStatus() == Order.Status.PENDING) {
                pendingOrders.add(order);
            }
        }

        return pendingOrders;
    }

    public enum Status {
        @SerializedName("closed")
        CLOSED,
        @SerializedName("waiting")
        WAITING,
        @SerializedName("open")
        OPEN
    }
}
