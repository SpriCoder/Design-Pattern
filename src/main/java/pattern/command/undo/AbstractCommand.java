package pattern.command.undo;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public abstract class AbstractCommand {
    public abstract int execute(int value);
    public abstract int undo();
}
