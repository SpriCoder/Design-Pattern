package pattern.intrinsic.network;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public class Switch implements NetworkDevice{
    private String type;
    private Port port;

    public Switch(String type) {
        this.type = type;
        this.port = new Port("Null");
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void use(Port port) {
        System.out.println(this.type  + " pre uses [" + this.port.getPort() + "]");
        this.port = port;
        System.out.println(this.type  + " now uses [" + this.port.getPort() + "]");
    }
}
