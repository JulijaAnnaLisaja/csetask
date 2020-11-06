package app.printer;

import app.interpreter.AndResult;
import app.interpreter.OrResult;
import app.interpreter.Result;
import app.interpreter.TerminalResult;

import static app.printer.CocktailBuilder.DRINK;
import static app.printer.CocktailBuilder.JUICE;
import static app.printer.CocktailBuilder.TOPPING;

public class MessageBuilder {

    static String messageBuilder() {

        String output = DRINK + " " + JUICE + " " + TOPPING;
        Result goodExpression = goodResultBuilder();
        Result badExpression = badResultBuilder();

        if (DRINK.equals("vodka") && JUICE.equals("tomato") && TOPPING.equals("celery")) {
            goodExpression.expression(output);
            return "Bloody Mary";
        } else if (DRINK.equals("rum") && JUICE.equals("lime") && TOPPING.equals("mint")) {
            goodExpression.expression(output);
            return "Mojito";
        } else if (DRINK.equals("rum") && JUICE.equals("coconut") && TOPPING.equals("pineapple")) {
            goodExpression.expression(output);
            return "Piña colada";
        } else if (DRINK.equals("gin") && JUICE.equals("pineapple") && TOPPING.equals("cherry")) {
            goodExpression.expression(output);
            return "Singapore Sling";
        } else if (DRINK.equals("gin") && JUICE.equals("lemon") && TOPPING.equals("cherry")) {
            goodExpression.expression(output);
            return "Tom Collins!";
        } else if (DRINK.equals("tequila") && JUICE.equals("lime") && TOPPING.equals("lime")) {
            goodExpression.expression(output);
            return "Margarita";
        } else if (badExpression.expression(output)) {
            return "Failed drink";
        }
        return "Experimental drink";
    }

    public static Result goodResultBuilder() {
        Result base = new TerminalResult("vodka");
        Result drink = new TerminalResult("tomato");
        Result topping = new TerminalResult("celery");

        return new AndResult(base, drink, topping);
    }


    public static Result badResultBuilder() {

        String data = "nothing";

        Result base = new TerminalResult(data);
        Result drink = new TerminalResult(data);
        Result topping = new TerminalResult(data);

        return new OrResult(base, drink, topping);
    }
}
