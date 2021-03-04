package pattern.strategy;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class MiniDuckSimulator {
    public static void performAll(Duck duck){
        duck.performFly();
        duck.performQuack();
        duck.display();
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        performAll(mallard);
        mallard.setFlyBehavior(new FlyNoWay());
        performAll(mallard);
    }
}
