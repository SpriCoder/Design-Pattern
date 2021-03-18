package pattern.command.macro;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class ConcreteCommandA extends Command{
    private ReceiverA receiverA = new ReceiverA();
    @Override
    public void execute() {
        receiverA.action();
    }
}
