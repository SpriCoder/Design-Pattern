package pattern.adapter.two;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class Adapter implements Target, Adaptee{
    private Adaptee adaptee;
    private Target target;

    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void setTarget(Target target) {
        this.target = target;
    }


}
