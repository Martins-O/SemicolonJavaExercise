package com.chapter8;

import org.junit.jupiter.api.Test;

class FoodTest {

    private Food food;

    @Test
    public void setUp(){
        System.out.printf("%-10s%-18s%s%n", "Food",
                "Number of Calories", "Types");
        for (Food food : Food.values()) {
            System.out.printf("%-10s%-18s%s%n", food,
                    food.getNumberOfCalories(), food.getType());
        }
    }
}