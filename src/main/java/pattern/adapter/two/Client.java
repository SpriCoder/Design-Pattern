package pattern.adapter.two;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        Adaptee adaptee = new ConcreteAdaptee();
        Adapter adapter = new Adapter();
        adapter.setAdaptee(adaptee);
        adapter.setTarget(target);
        adapter.request();
        adapter.specificRequest();
    }
}
