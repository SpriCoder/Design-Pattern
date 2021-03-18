package pattern.command.macro;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class CompositeCommand extends Command{
    private List<Command> commands = new ArrayList<>();

    @Override
    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void removeCommand(Command command) {
        commands.remove(command);
    }

    @Override
    public Command getCommand(int i) {
        return commands.get(i);
    }

    @Override
    public void execute() {
        for(Command command: commands){
            command.execute();
        }
    }
}
