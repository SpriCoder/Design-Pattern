package pattern.proxy.frame;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Subject real = new RealSubject();
        Subject proxy = new Proxy(real);
        proxy.request();
    }
}
