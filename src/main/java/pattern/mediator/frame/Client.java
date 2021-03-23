package pattern.mediator.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        College college1 = new ConcreteCollege(mediator);
        College college2 = new ConcreteCollege(mediator);
        mediator.register(college1);
        mediator.register(college2);
        college1.method2();
    }
}
