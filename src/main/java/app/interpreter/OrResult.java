package app.interpreter;

/** Implements and overrides methods from Result interface. */
public class OrResult implements Result {

    private Result ingredient1 = null;
    private Result ingredient2 = null;
    private Result ingredient3 = null;

    /**
     * Constructor for cocktail ingredient initialization.
     * @param ingredient1 first cocktail ingredient.
     * @param ingredient2 second cocktail ingredient.
     * @param ingredient3 third cocktail ingredient.
     */
    public OrResult(Result ingredient1, Result ingredient2, Result ingredient3) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }

    /**
     * Overridden result method.
     * @param context String.
     * @return first OR second OR third result interpreters.
     */
    @Override
    public boolean expression(String context) {
        return ingredient1.expression(context) || ingredient2.expression(context) || ingredient3.expression(context);
    }
}
