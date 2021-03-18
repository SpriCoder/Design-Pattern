package pattern.command.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class ConcreteCommand extends Command{
    @Override
    void execute() {
        System.out.println("ConcreteCommand!");
        receiver.action();
    }
}
