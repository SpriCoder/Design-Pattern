package pattern.adapter.ObjectAdapter;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class Adapter extends Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
