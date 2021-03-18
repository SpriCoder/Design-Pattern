package pattern.state.hotel;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class Room {
    private RoomState roomState = new LeisureState();

    public void setRoomState(RoomState roomState) {
        this.roomState = roomState;
    }

    public void reserve(){
        roomState.reserve();
        this.setRoomState(new ReservedState());
    }
    public void checkin(){
        roomState.checkin();
        this.setRoomState(new LivingState());
    }
    public void cancel(){
        roomState.cancel();
        this.setRoomState(new LeisureState());
    }
    public void checkout(){
        roomState.checkout();
        this.setRoomState(new LeisureState());
    }
}
