package pattern.adapter.two;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class ConcreteAdaptee implements Adaptee{
    @Override
    public void specificRequest() {
        System.out.println("ConcreteAdaptee SpecificRequest!");
    }
}
