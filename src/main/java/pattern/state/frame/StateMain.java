package pattern.state.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class StateMain {
    public static void main(String[] args) {
        Context context = new Context();
        State state1 = new ConcreteStateA();
        State state2 = new ConcreteStateB();
        context.setState(state1);
        context.request();
        context.setState(state2);
        context.request();
    }
}
