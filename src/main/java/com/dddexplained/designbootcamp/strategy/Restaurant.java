package com.dddexplained.designbootcamp.strategy;

public class Restaurant {
    private Location location;

    public Restaurant(Location location) {
        this.location = location;
    }

    public double distanceOf(Location location) {
        return this.location.distanceOf(location);
    }
}
