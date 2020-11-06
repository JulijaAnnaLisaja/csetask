package app.decorator;

/** Generates result message. */
public class ResultDecorator  extends MessageDecorator {

    private static final String RESULT_MESSAGE = "And you get";

    /**
     * Message to which barmen's words will be putted.
     * @param customMessage decorated message.
     */
    public ResultDecorator(Message customMessage) { super(customMessage); }

    /**
     * Return barmen's result message.
     * @return message
     */
    @Override
    public String speak() { return messageResult(); }

    /**
     * Received barmen's goodbye result.
     * @return message
     */
    private String messageResult() { return RESULT_MESSAGE; }
}
