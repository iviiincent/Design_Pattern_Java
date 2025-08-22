package _22_command.command;

import java.util.Stack;

public class MacroCommand implements Command {

    private final Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void append(Command command) {
        if (command != null) {
            commands.push(command);
        }
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
