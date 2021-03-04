package principle.ISP;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class ClientC implements AbstractServiceC{
    @Override
    public void operatorC() {
        System.out.println("Client C with Operator C");
    }
}
