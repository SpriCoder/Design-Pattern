package pattern.command.tv;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class TVChangeCommand extends AbstractCommand{
    protected Television television = new Television();
    @Override
    public void execute() {
        television.changeChannel();
    }
}
