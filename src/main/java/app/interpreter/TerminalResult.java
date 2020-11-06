package app.interpreter;

import lombok.AllArgsConstructor;

/** */
@AllArgsConstructor
public class TerminalResult implements Result {

    /** Data to check. */
    private final String data;

    /**
     * Checks if method parameter (String) contains result value.
     * @param context Context to interpret.
     * @return boolean value.
     */
    @Override
    public boolean expression(String context) {
        return context.contains(data);
    }
}
