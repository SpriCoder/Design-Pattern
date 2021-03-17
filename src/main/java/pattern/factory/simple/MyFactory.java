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
            default:
                break;
        }
        return null;
    }

    public static void main(String[] args) {
        // 标准的简单工厂
        Product product1 = MyFactory.factoryMethod("ConcreteProductA");
        assert product1 != null;
        product1.produce();
        Product product2 = MyFactory.factoryMethod("ConcreteProductB");
        assert product2 != null;
        product2.produce();

        // 将工厂方法和工厂合并
        product1 = Product.factoryMethod("ConcreteProductA");
        assert product1 != null;
        product1.produce();
        product2 = Product.factoryMethod("ConcreteProductB");
        assert product2 != null;
        product2.produce();
    }
}
