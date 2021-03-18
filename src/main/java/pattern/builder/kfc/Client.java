package pattern.builder.kfc;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        KFCWaiter waiter1 = new KFCWaiter();
        waiter1.setMealBuilder(new SubMealBuilderA());
        System.out.println(waiter1.construct());
        KFCWaiter waiter2 = new KFCWaiter();
        waiter2.setMealBuilder(new SubMealBuilderB());
        System.out.println(waiter2.construct());
    }
}
