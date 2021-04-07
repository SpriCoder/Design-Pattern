package pattern.intrinsic.frame;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        flyWeightFactory.getFlyWeight("Concrete").operation("test");
        flyWeightFactory.getFlyWeight("Unshared").operation("test");
    }
}
