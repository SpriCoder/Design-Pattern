package pattern.intrinsic.frame;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public class UnsharedConcreteFlyWeight implements FlyWeight{
    private String allState;

    public UnsharedConcreteFlyWeight(String allState) {
        this.allState = allState;
    }

    @Override
    public void operation(String extrinsicState) {
        allState = allState + "|" + extrinsicState;
        System.out.println(this.getClass().toString() + "|" + allState);
    }
}
