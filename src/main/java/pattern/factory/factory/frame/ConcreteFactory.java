package pattern.factory.factory.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/09
 * @Version 1.0
 **/

public class ConcreteFactory extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
