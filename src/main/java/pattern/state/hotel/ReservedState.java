package pattern.state.hotel;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class ReservedState extends RoomState{
    @Override
    public void checkin() {
        super.checkin();
        System.out.println("checkin");
    }

    @Override
    public void cancel() {
        super.cancel();
        System.out.println("cancel");
    }
}
