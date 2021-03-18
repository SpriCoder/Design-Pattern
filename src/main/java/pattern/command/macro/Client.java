package pattern.command.macro;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command command = new CompositeCommand();
        Command command1 = new ConcreteCommandA();
        Command command2 = new ConcreteCommandB();
        command.addCommand(command1);
        command.addCommand(command2);
        invoker.setCommand(command);
        invoker.call();
        System.out.println("======================");
        invoker.setCommand(command1);
        invoker.call();
        System.out.println("======================");
        invoker.setCommand(command2);
        invoker.call();
    }
}
