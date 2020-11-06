package app.templatemethod;

import java.text.DecimalFormat;
import java.util.Random;

/** Implements price method from a parent class  that can be used by template method. */
public class PositivePriceGenerator extends PriceGenerator {

    private static final Random RANDOM = new Random();

    /**
     * Returns price.
     * @return Price for the usual drink.
     */
    @Override
    protected String price() {
        double price = 2 + RANDOM.nextDouble();
        return Double.toString(price);
    }
}
