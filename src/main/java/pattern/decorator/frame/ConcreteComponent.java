package pattern.decorator.frame;

/**
 * @Author stormbroken
 * Create by 2021/04/05
 * @Version 1.0
 **/

public class ConcreteComponent extends Component{
    @Override
    public void operation() {
        System.out.println("I am ConcreteComponent");
    }
}
