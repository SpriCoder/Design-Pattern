package pattern.intrinsic.network;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public interface NetworkDevice {
    String getType();
    void use(Port port);
}
