package pattern.adapter.ClassAdapter;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
