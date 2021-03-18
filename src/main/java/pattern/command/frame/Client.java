package pattern.command.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand();
        command.setReceiver(receiver);
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}
