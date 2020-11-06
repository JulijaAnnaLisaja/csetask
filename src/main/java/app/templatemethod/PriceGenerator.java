package app.templatemethod;

/** Implements the Template Method 'generator'. */
public abstract class PriceGenerator {

    /**
     * Method that returns the generated price.
     * @return price
     */
    public String priceGenerator() { return price(); }

    /**
     * Provides price description.
     * @return Price description
     */
    protected abstract String price();
}
