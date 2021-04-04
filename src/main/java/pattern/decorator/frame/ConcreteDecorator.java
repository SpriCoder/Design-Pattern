package pattern.decorator.frame;

/**
 * @Author stormbroken
 * Create by 2021/04/05
 * @Version 1.0
 **/

public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component){
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }

    public void addBehavior(){
        System.out.println("Do Add Behaviors!");
    }
}
