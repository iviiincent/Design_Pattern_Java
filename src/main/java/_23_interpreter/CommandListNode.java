package _23_interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * <command list> ::= <command>* end
 */
public class CommandListNode extends Node {

    private final List<Node> commands = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'.");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                commands.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return commands.toString();
    }
}
