package com.dddexplained.designbootcamp.strategy;

import javax.annotation.concurrent.Immutable;

@Immutable
public final class Location {
    private final double longitude;
    private final double latitude;

    public Location(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }
    public double getLatitude() {
        return this.latitude;
    }

    public double distanceOf(Location location) {
        double radiansOfStartLongitude = Math.toRadians(longitude);
        double radiansOfStartDimension = Math.toRadians(latitude);
        double radiansOfEndLongitude = Math.toRadians(location.getLongitude());
        double radiansOfEndDimension = Math.toRadians(location.getLatitude());

        return Math.acos(
                Math.sin(radiansOfStartLongitude) * Math.sin(radiansOfEndLongitude) +
                        Math.cos(radiansOfStartLongitude) * Math.cos(radiansOfEndLongitude) * Math.cos(radiansOfEndDimension - radiansOfStartDimension)
        );
    }
}
