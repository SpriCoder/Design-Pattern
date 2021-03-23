package pattern.mediator.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public class ConcreteMediator extends Mediator{
    @Override
    public void operation() {
        for(College college : colleges){
            college.method1();
        }
    }
}
