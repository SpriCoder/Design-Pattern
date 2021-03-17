package pattern.builder.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public abstract class Builder {
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    public Product getResult(){
        return product;
    }
}
