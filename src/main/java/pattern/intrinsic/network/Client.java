package pattern.intrinsic.network;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = new DeviceFactory();
        Port port1 = new Port("8000");
        Port port2 = new Port("8001");
        Port port3 = new Port("8002");
        deviceFactory.getNetworkDevice("Hub1").use(port1);
        deviceFactory.getNetworkDevice("Switch1").use(port2);
        deviceFactory.getNetworkDevice("Hub1").use(port3);
    }
}
