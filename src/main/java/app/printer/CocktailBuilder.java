package app.printer;

import app.builder.CocktailDrink;
import app.composite.DrinkIngredient;
import app.composite.JuiceIngredient;
import app.composite.ToppingIngredient;
import app.decorator.GoodbyeDecorator;
import app.decorator.GreetingDecorator;
import app.decorator.IngredientDecorator;
import app.decorator.Message;
import app.decorator.PriceDecorator;
import app.decorator.ResultDecorator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static app.printer.MessageBuilder.messageBuilder;
import static app.printer.PriceBuilder.priceBuilder;

public class CocktailBuilder {

    public static final DrinkIngredient BASE_LIST = new DrinkIngredient();
    public static final JuiceIngredient DRINK_LIST = new JuiceIngredient();
    public static final ToppingIngredient TOPPING_LIST = new ToppingIngredient();

    public static final String DRINK = BASE_LIST.getIngredient();
    public static final String JUICE = DRINK_LIST.getIngredient();
    public static final String TOPPING = TOPPING_LIST.getIngredient();

    private static final Logger logger = LogManager.getLogger(CocktailBuilder.class);

    public static void printCocktailInfo(final CocktailDrink cocktailDrink) {

        Message message = new GreetingDecorator();
        String greetingMessage = message.speak();
        logger.info(greetingMessage);

        message = new IngredientDecorator(message);
        String ingredientsMessage = message.speak();
        logger.info(ingredientsMessage);
        for (final String ingredients : cocktailDrink.getIngredients()) { logger.debug(ingredients); }

        message = new ResultDecorator(message);
        String resultMessage = message.speak();
        logger.debug("{} {}", resultMessage, cocktailDrink.getName());

        message = new PriceDecorator(message);
        String priceMessage = message.speak();
        logger.debug("{}{} €", priceMessage, cocktailDrink.getPrice());

        message = new GoodbyeDecorator(message);
        String goodbyeMessage = message.speak();
        logger.info(goodbyeMessage);
    }

    public static CocktailDrink cocktailBuilder() {
        return app.builder.CocktailBuilder.cocktailDrink()
                .withName(messageBuilder())
                .withIngredients("   - As a base    : " + DRINK)
                .withIngredients("   - As a drink   : " + JUICE)
                .withIngredients("   - As a topping : " + TOPPING)
                .withPrice(priceBuilder())
                .build();
    }
}
