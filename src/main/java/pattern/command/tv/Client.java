package pattern.command.tv;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Controller controller = new Controller(new TVOpenCommand(), new TVCloseCommand(), new TVChangeCommand());
        controller.open();
        controller.close();
        controller.change();
    }
}
