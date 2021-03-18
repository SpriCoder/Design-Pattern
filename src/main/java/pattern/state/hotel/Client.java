package pattern.state.hotel;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Room room = new Room();
        room.reserve();
        room.cancel();

        room.reserve();
        room.checkin();
        room.checkout();
    }
}
