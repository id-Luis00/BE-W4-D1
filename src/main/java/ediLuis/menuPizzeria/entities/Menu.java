package ediLuis.menuPizzeria.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;


    public Menu(List<Pizza> pizzas, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.drinks = drinks;
    }


    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void printMenu() {
        System.out.println("Pizzas:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.getName() + " (" + pizza.getCalories() + " cal) - " + pizza.getPrice() + " USD");
        }

        System.out.println("\nDrinks:");
        for (Drink drink : drinks) {
            System.out.println(drink.getName() + " (" + drink.getVolume() + "L, " + drink.getCalories() + " cal) - " + drink.getPrice() + " USD");
        }
    }
}
