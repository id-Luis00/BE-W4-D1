package ediLuis.menuPizzeria;

import ediLuis.menuPizzeria.entities.Drink;
import ediLuis.menuPizzeria.entities.Menu;
import ediLuis.menuPizzeria.entities.Pizza;
import ediLuis.menuPizzeria.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MenuConfig {

    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean
    public Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    public Topping onions() {
        return new Topping("Onions", 22, 0.69);
    }

    @Bean
    public Topping pineapple() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean
    public Topping salami() {
        return new Topping("Salami", 86, 0.99);
    }

    @Bean
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", Arrays.asList(cheese()), 4.99, 1104);
    }

    @Bean
    public Pizza hawaiianPizza() {
        return new Pizza("Hawaiian Pizza", Arrays.asList(cheese(), ham(), pineapple()), 6.49, 1024);
    }

    @Bean
    public Pizza salamiPizza() {
        return new Pizza("Salami Pizza", Arrays.asList(cheese(), salami()), 5.99, 1160);
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade", 0.33, 128, 1.29);
    }

    @Bean
    public Drink water() {
        return new Drink("Water", 0.5, 0, 1.29);
    }

    @Bean
    public Drink wine() {
        return new Drink("Wine", 0.75, 607, 7.49);
    }

    @Bean
    public Menu menu() {
        List<Pizza> pizzas = Arrays.asList(margherita(), hawaiianPizza(), salamiPizza());
        List<Drink> drinks = Arrays.asList(lemonade(), water(), wine());
        return new Menu(pizzas, drinks);
    }
}
