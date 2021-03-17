package pattern.factory.abstractfactory;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class ConcreteFactory1 extends Factory{
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
