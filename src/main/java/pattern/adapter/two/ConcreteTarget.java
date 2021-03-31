package pattern.adapter.two;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("ConcreteTarget Request!");
    }
}
