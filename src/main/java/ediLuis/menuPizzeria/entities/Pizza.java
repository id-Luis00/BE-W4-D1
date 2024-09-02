package ediLuis.menuPizzeria.entities;

import java.util.*;

public class Pizza {
    private String name;
    private List<Topping> toppings;
    private double price;
    private int calories;

    public Pizza(String name, List<Topping> toppings, double price, int calories) {
        this.name = name;
        this.toppings = toppings;
        this.price = price;
        this.calories = calories;
    }


    public String getName() {
        return name;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }
}
