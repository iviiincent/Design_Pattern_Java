package _23_interpreter;

import java.util.StringTokenizer;

public class Context {

    private final StringTokenizer tokenizer;

    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text, " ");
        nextToken();
    }

    public void skipToken(String token) throws ParseException {
        if (!token.equals(currentToken)) {
            throw new ParseException(
                    "Warning: " + token + "is expected, but " + currentToken + " is found in context.");
        }
        nextToken();
    }

    public String currentToken() {
        return currentToken;
    }

    public int currentNumber() {
        int number;
        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning: " + e);
        }
        return number;
    }

    public void nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
    }
}
