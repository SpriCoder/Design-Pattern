package pattern.adapter.ClassAdapter;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
