package pattern.strategy;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm Flying!");
    }
}
