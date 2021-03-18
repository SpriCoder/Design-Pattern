package pattern.state.hotel;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class LivingState extends RoomState{
    @Override
    public void checkout() {
        super.checkout();
        System.out.println("checkout");
    }
}
