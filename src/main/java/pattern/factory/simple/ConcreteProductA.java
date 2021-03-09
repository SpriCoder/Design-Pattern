package pattern.factory.simple;

/**
 * @Author stormbroken
 * Create by 2021/03/09
 * @Version 1.0
 **/

public class ConcreteProductA extends Product{
    @Override
    public void produce() {
        System.out.println("ConcreteProductA");
    }
}
