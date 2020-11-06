package app.decorator;

import lombok.AllArgsConstructor;

/** Message abstract representation. */
@AllArgsConstructor
public abstract class MessageDecorator implements Message {

    protected Message customMessage;

    /**
     * Return words from barmen's message
     * @return message
     */
    @Override
    public String speak() {
        return customMessage.speak();
    }
}
