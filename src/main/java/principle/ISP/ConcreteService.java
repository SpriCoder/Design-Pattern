package principle.ISP;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class ConcreteService implements AbstractServiceA, AbstractServiceB, AbstractServiceC{
    @Override
    public void operatorA() {
        System.out.println("ConcreteService with Operator A");
    }

    @Override
    public void operatorB() {
        System.out.println("ConcreteService with Operator B");
    }

    @Override
    public void operatorC() {
        System.out.println("ConcreteService with Operator C");
    }
}
