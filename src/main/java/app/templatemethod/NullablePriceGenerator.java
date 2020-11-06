package app.templatemethod;

/** Implements price method from a parent class  that can be used by template method. */
public class NullablePriceGenerator extends PriceGenerator {

    private static final String FAILED_DRINK_PRICE = "0.00";

    /**
     * Returns price.
     * @return Price for the failed drink.
     */
    @Override
    protected String price() {
        return FAILED_DRINK_PRICE;
    }
}

