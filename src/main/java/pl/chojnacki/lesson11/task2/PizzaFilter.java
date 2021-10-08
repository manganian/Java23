package pl.chojnacki.lesson11.task2;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class PizzaFilter {
    private final List<Pizza> pizzas;

    public PizzaFilter(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void printVegetarianPizzas() {
        pizzas.stream()
                .filter(Pizza::isVegetarian)
                .forEach(System.out::println);
    }

    public void printPizzasWithAllergens() {
        pizzas.stream()
                .filter(p -> p.getIngredients().contains(Ingredients.CELERY))
                .forEach(System.out::println);
    }

    public boolean isAnyVegPizzaWithTomatoAndPepper() {
        return pizzas.stream()
                .filter(Pizza::isVegetarian)
                .anyMatch(p -> p.getIngredients().contains(Ingredients.TOMATO) && p.getIngredients().contains(Ingredients.PEPPER));
    }

    public boolean isAllPizzasContainMozzarella() {
        return pizzas.stream()
                .allMatch(p -> p.getIngredients().contains(Ingredients.MOZZARELLA));
    }

    public Pizza findHighestCaloriePizza() {
        return pizzas.stream()
                .max(Comparator.comparing(Pizza::getKcal))
                .orElseThrow(NoSuchElementException::new);
    }

    public Pizza findLowestCaloriePizza() {
        return pizzas.stream()
                .min(Comparator.comparing(Pizza::getKcal))
                .orElseThrow(NoSuchElementException::new);
    }

}
