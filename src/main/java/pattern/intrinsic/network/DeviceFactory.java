package pattern.intrinsic.network;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public class DeviceFactory {
    private Map<String, NetworkDevice> networkDeviceMap;
    private Integer totalTerminal;

    public DeviceFactory() {
        networkDeviceMap = new HashMap<>();
        totalTerminal = 0;
    }

    public NetworkDevice getNetworkDevice(String type){
        if(networkDeviceMap.containsKey(type)){
            return networkDeviceMap.get(type);
        }else{
            NetworkDevice networkDevice;
            if(type.startsWith("Hub")){
                networkDevice = new Hub(type);
            }else if(type.startsWith("Switch")){
                networkDevice = new Switch(type);
            }else{
                System.out.println("Error Type!");
                return null;
            }
            networkDeviceMap.put(type, networkDevice);
            return networkDevice;
        }
    }

    public Integer getTotalTerminal() {
        return totalTerminal;
    }

    public Integer getTotalDevice(){
        return networkDeviceMap.keySet().size();
    }
}
