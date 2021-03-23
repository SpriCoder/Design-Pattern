package pattern.mediator.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public class ConcreteCollege extends College{
    public ConcreteCollege(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void method1() {
        System.out.println("收到通知");
    }

    @Override
    public void method2() {
        System.out.println("发送通知");
        mediator.operation();
    }
}
