package pattern.command.macro;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public abstract class Command {
    public void addCommand(Command command){}

    public void removeCommand(Command command){}

    public Command getCommand(int i){return null;}

    public abstract void execute();
}
