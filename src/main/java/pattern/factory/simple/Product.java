package pattern.factory.simple;

/**
 * @Author stormbroken
 * Create by 2021/03/09
 * @Version 1.0
 **/

public abstract class Product {
    public abstract void produce();

    public static Product factoryMethod(String arg){
        switch (arg){
            case "ConcreteProductA":
                return new ConcreteProductA();
            case "ConcreteProductB":
                return new ConcreteProductB();
            default:
                break;
        }
        return null;
    }
}
