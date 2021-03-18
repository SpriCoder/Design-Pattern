package pattern.state.hotel;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class LeisureState extends RoomState{
    @Override
    public void reserve() {
        super.reserve();
        System.out.println("reserve");
    }

    @Override
    public void checkin() {
        super.checkin();
        System.out.println("checkin");
    }
}
