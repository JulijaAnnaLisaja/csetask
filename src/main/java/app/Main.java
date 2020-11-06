package app;

import static app.printer.CocktailBuilder.cocktailBuilder;
import static app.printer.CocktailBuilder.printCocktailInfo;

/** Main output class. */
public class Main {

    public static void main(String[] args) {
        printCocktailInfo(cocktailBuilder());
    }
}
