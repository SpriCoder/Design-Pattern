package pattern.decorator.frame;

/**
 * @Author stormbroken
 * Create by 2021/04/05
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component c = new ConcreteDecorator(component);
        c.operation();
    }
}
