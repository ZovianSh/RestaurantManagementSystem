package org.zovian;

import org.zovian.dto.Beverage;
import org.zovian.dto.Dish;
import org.zovian.dto.FoodType;
import org.zovian.dto.RestaurantManagementSystem;

public class Main {
    public static void main(String[] args) {
        RestaurantManagementSystem restaurantManagementSystem = new RestaurantManagementSystem();
        Dish dish1 = new Dish("Fries", 12.99, FoodType.SEA_FOOD);
        Beverage coke = new Beverage("coke", 1.99, false);
        System.out.println(restaurantManagementSystem);
    }
}