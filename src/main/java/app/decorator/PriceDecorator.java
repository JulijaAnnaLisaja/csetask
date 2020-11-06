package app.decorator;

/** Generates price message. */
public class PriceDecorator extends MessageDecorator {

    private static final String PRICE_MESSAGE = "Your price is : ";

    /**
     * Message to which barmen's words will be putted.
     * @param customMessage decorated message.
     */
    public PriceDecorator(Message customMessage) { super(customMessage); }

    /**
     * Return barmen's price message.
     * @return message
     */
    @Override
    public String speak() { return messagePrice(); }

    /**
     * Received barmen's price message.
     * @return message
     */
    private String messagePrice() { return PRICE_MESSAGE; }

}
