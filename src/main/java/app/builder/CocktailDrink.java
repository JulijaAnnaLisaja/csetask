package app.builder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Contain information about cocktail component.
 */
@Getter
@Setter
@RequiredArgsConstructor
public class CocktailDrink {

    private final String name;
    private final List<String> ingredients;
    private final Double price;
}