package pattern.strategy.duck;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't Fly");
    }
}
