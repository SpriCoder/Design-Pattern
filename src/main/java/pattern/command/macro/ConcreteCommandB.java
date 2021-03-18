package pattern.command.macro;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class ConcreteCommandB extends Command {
    private ReceiverB receiverB = new ReceiverB();
    @Override
    public void execute() {
        receiverB.action();
    }
}
