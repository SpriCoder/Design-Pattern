package pattern.adapter.ObjectAdapter;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
