package principle.ISP;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class ClientB implements AbstractServiceB{
    @Override
    public void operatorB() {
        System.out.println("Client B with Operator B");
    }
}
