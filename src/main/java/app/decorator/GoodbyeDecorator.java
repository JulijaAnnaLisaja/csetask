package app.decorator;

/** Generates goodbye message. */
public class GoodbyeDecorator extends MessageDecorator {

    private static final String GOODBYE_MESSAGE = "Goodbye!";

    /**
     * Message to which barmen's words will be putted.
     * @param customMessage decorated message.
     */
    public GoodbyeDecorator(Message customMessage) { super(customMessage); }

    /**
     * Return barmen's goodbye message.
     * @return message
     */
    @Override
    public String speak() { return messageGoodbye(); }

    /**
     * Received barmen's goodbye message.
     * @return message
     */
    private String messageGoodbye() { return GOODBYE_MESSAGE; }
}
