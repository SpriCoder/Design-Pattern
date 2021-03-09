package pattern.factory.simple;

/**
 * @Author stormbroken
 * Create by 2021/03/09
 * @Version 1.0
 **/

public class MyFactory {
    public static Product factoryMethod(String arg){
        switch (arg){
            case "ConcreteProductA":
                return new ConcreteProductA();
            case "ConcreteProductB":
                return new ConcreteProductB();
        }
        return null;
    }

    public static void main(String[] args) {
        Product product1 = MyFactory.factoryMethod("ConcreteProductA");
        product1.produce();
        Product product2 = MyFactory.factoryMethod("ConcreteProductB");
        product2.produce();
    }
}
