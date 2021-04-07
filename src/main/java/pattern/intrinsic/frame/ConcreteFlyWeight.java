package pattern.intrinsic.frame;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public class ConcreteFlyWeight implements FlyWeight{
    private String intrinsicState;

    public ConcreteFlyWeight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState){
        intrinsicState = intrinsicState+ "|" + extrinsicState;
        System.out.println(this.getClass().toString() + "|" + intrinsicState);
    }
}
