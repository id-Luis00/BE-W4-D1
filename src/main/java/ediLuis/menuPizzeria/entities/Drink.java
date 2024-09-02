package ediLuis.menuPizzeria.entities;

public class Drink {
    private String name;
    private double volume;
    private int calories;
    private double price;


    public Drink(String name, double volume, int calories, double price) {
        this.name = name;
        this.volume = volume;
        this.calories = calories;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }
}
