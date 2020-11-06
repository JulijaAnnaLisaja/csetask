package app.builder;

import lombok.RequiredArgsConstructor;

import java.util.LinkedList;
import java.util.List;

/**
 * Creates cocktail from provided class components.
 */
@RequiredArgsConstructor
public final class CocktailBuilder {

    private String name;
    private final List<String> ingredients;
    private Double price;

    public CocktailBuilder() {
        ingredients = new LinkedList<>();
    }

    public static CocktailBuilder cocktailDrink() {
        return new CocktailBuilder();
    }

    public CocktailBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CocktailBuilder withIngredients(String ingredients) {
        this.ingredients.add(ingredients);
        return this;
    }

    public CocktailBuilder withPrice(Double price) {
        this.price = price;
        return this;
    }

    public CocktailDrink build() {
        return new CocktailDrink(name, ingredients, price);
    }
}
