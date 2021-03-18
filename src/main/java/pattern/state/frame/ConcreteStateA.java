package pattern.state.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class ConcreteStateA extends State{
    @Override
    void handle() {
        System.out.println("ConcreteStateA");
    }
}
