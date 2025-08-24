package _23_interpreter;

/**
 * <primitive command> ::= go | right | left
 */
public class PrimitiveCommandNode extends Node {

    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!"go".equals(name) && !"right".equals(name) && !"left".equals(name)) {
            throw new ParseException(name + " is undefined.");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
