package pattern.builder.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class ConcreteBuilder extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("ConcreteBuilder builds PartA!");
    }

    @Override
    public void buildPartB() {
        product.setPartB("ConcreteBuilder builds PartB!");
    }

    @Override
    public void buildPartC() {
        product.setPartC("ConcreteBuilder builds PartC!");
    }
}
