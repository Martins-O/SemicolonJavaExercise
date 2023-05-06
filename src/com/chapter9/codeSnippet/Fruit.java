package com.chapter9.codeSnippet;

public class Fruit {

    private String taste;
    private String shape;
    private int calories;

    private String color;

    public Fruit(String taste, String shape, int calories, String color) {
        this.taste = taste;
        this.shape = shape;
        this.calories = calories;
        this.color = color;
    }

    public void taste(){
        System.out.println("I have fruit taste");
    }

    public void shape(){
        System.out.println("I have fruit shape");
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "taste='" + taste + '\'' +
                ", shape='" + shape + '\'' +
                ", calories=" + calories +
                ", color='" + color + '\'' +
                '}';
    }
}
