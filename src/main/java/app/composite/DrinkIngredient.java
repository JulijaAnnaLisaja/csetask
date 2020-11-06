package app.composite;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/** Implements Ingredient interface. */
public class DrinkIngredient implements Ingredient {

    protected static final List<String> DRINK_LIST = Arrays.asList("vodka", "rum", "gin", "tequila", "nothing");
    private static final Random random = new Random();

    /** Output file name for DrinkIngredient objects. */
    @Override
    public String getIngredient() {
        int index = random.nextInt(DRINK_LIST.size());
        return DRINK_LIST.get(index);
    }
}