package app.decorator;

/** Generates ingredients' message. */
public class IngredientDecorator extends MessageDecorator {

    private static final String INGREDIENTS_MESSAGE = "Let's add some ingredients!";

    /**
     * Message to which barmen's words will be putted.
     * @param customMessage decorated message.
     */
    public IngredientDecorator(Message customMessage) { super(customMessage); }

    /**
     * Return barmen's ingredients' message.
     * @return message
     */
    @Override
    public String speak() { return messageIngredient(); }

    /**
     * Received barmen's ingredients' message.
     * @return message
     */
    private String messageIngredient() { return INGREDIENTS_MESSAGE; }
}
