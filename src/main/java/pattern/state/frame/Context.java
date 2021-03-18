package pattern.state.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        this.state.handle();
    }
}
