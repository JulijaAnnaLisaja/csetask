package app.interpreter;

/** contains methods which must be implemented by classes. */
public interface Result {

    /**
     * Result context.
     * @param context Context to interpret.
     * @return True if matches the expression context.
     */
    boolean expression(String context);
}
