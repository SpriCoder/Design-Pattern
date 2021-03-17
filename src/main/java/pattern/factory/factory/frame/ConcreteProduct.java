package pattern.factory.factory.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/09
 * @Version 1.0
 **/

public class ConcreteProduct extends Product{
    @Override
    public void produce() {
        System.out.println("ConcreteProduct");
    }
}
