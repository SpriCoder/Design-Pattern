package pattern.proxy.frame;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public class RealSubject extends Subject{
    @Override
    public void request() {
        System.out.println("RealSubject Proxy!");
    }
}
