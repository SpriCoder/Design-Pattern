package pattern.bridge.frame;

/**
 * @Author stormbroken
 * Create by 2021/04/05
 * @Version 1.0
 **/

public class RefinedAbstraction extends Abstraction{
    @Override
    public void operation() {
        implementor.operationImpl();
    }
}
