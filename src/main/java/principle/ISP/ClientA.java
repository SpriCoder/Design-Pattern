package principle.ISP;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class ClientA implements AbstractServiceA{
    @Override
    public void operatorA() {
        System.out.println("Client A with Operator A");
    }
}
