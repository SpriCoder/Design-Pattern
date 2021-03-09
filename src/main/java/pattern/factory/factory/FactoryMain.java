package pattern.factory.factory;

/**
 * @Author stormbroken
 * Create by 2021/03/09
 * @Version 1.0
 **/

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();
        product.produce();
    }
}
