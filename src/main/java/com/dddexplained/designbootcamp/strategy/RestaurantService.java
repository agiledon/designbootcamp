package com.dddexplained.designbootcamp.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RestaurantService {
    private static long RADIUS = 3000;
    private RestaurantRepository restaurantRepo;

    public RestaurantService(RestaurantRepository restaurantRepo) {
        this.restaurantRepo = restaurantRepo;
    }

    public Restaurant neareastRestaurant(Location location) {
        List<Restaurant> restaurants = restaurantRepo.allRestaurantsOf(location, RADIUS);
        if (restaurants.isEmpty()) {
            throw new RestaurantException("Required restaurants not found.");
        }
        Collections.sort(restaurants, new RestaurantComparator(location));
        return restaurants.get(0);
    }

    // 相当于是一个具体的策略对象
    private final class RestaurantComparator implements Comparator<Restaurant> {
        private Location currentLocation;
        RestaurantComparator(Location currentLocation) {
            this.currentLocation = currentLocation;
        }

        @Override
        public int compare(Restaurant r1, Restaurant r2) {
            double distanceOfL1 = r1.distanceOf(currentLocation);
            double distanceOfL2 = r2.distanceOf(currentLocation);
            return Double.compare(distanceOfL1, distanceOfL2);
        }
    }
}
