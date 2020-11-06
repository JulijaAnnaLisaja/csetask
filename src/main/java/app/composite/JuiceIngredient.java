package app.composite;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/** Implements Ingredient interface. */
public class JuiceIngredient implements Ingredient {

    protected static final List<String> JUICE_LIST = Arrays.asList("tomato", "lime", "coconut", "pineapple", "lemon", "nothing");
    private static final Random random = new Random();

    /** Output file name for JuiceIngredient objects. */
    @Override
    public String getIngredient() {
        int index = random.nextInt(JUICE_LIST.size());
        return JUICE_LIST.get(index);
    }
}
