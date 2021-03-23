package pattern.observe;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public class ConcreteObserver implements MyObserver{
    @Override
    public void update() {
        System.out.println(this.getClass().toString());
    }
}
