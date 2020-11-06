package app.decorator;

/** Generates greeting message. */
public class GreetingDecorator implements Message {

    private static final String GREETING_MESSAGE = "Hello!";

    /**
     * Received barmen's greeting message.
     * @return message.
     */
    @Override
    public String speak() {
        return GREETING_MESSAGE;
    }
}
