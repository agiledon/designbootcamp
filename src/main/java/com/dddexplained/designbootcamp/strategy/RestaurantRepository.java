package com.dddexplained.designbootcamp.strategy;

import java.util.List;

public interface RestaurantRepository {
    List<Restaurant> allRestaurantsOf(Location location, long radius);
}
