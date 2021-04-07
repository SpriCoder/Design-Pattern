package pattern.proxy.nativeImpl;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        ConcretePersonProxy concretePersonProxy = new ConcretePersonProxy();
        Person person = concretePersonProxy.getProxy();
        String retValue = person.sing("rainy day");
        System.out.println(retValue);
        String value = person.dance("my style");
        System.out.println(value);
    }
}
