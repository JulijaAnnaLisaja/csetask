package app.composite;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/** Implements Ingredient interface. */
public class ToppingIngredient implements Ingredient {

    protected static final List<String> TOPPING_LIST = Arrays.asList("celery", "mint", "pineapple", "cherry", "lime", "nothing");
    private static final Random random = new Random();

    /** Output file name for ToppingIngredient objects. */
    @Override
    public String getIngredient() {
        int index = random.nextInt(TOPPING_LIST.size());
        return TOPPING_LIST.get(index);
    }
}
