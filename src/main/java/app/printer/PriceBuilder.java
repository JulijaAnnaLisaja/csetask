package app.printer;

import app.interpreter.Result;
import app.templatemethod.NullablePriceGenerator;
import app.templatemethod.PositivePriceGenerator;
import app.templatemethod.PriceGenerator;

import static app.printer.CocktailBuilder.DRINK;
import static app.printer.CocktailBuilder.JUICE;
import static app.printer.CocktailBuilder.TOPPING;
import static app.printer.MessageBuilder.badResultBuilder;

public class PriceBuilder {

    public static final PriceGenerator positivePrice = new PositivePriceGenerator();
    public static final PriceGenerator nullablePrice = new NullablePriceGenerator();

    public static double priceBuilder() {
        Result badExpression = badResultBuilder();
        String output = DRINK + " " + JUICE + " " + TOPPING;

        double price;

        if (badExpression.expression(output))
            price = Double.parseDouble(nullablePrice.priceGenerator());
        else
            price = Double.parseDouble(positivePrice.priceGenerator());
        return price;
    }
}
