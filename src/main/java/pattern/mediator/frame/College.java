package pattern.mediator.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public abstract class College {
    protected Mediator mediator;
    public College(Mediator mediator){
        this.mediator = mediator;
    }
    // 接受通知
    public abstract void method1();
    // 发送通知
    public abstract void method2();
}
