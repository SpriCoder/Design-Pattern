package pattern.proxy.frame;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public class Proxy extends Subject{
    private RealSubject realSubject;

    public Proxy(Subject subject) {
        this.realSubject = (RealSubject) subject;
    }

    public void preRequest(){
        System.out.println("Do preRequest");
    }

    @Override
    public void request(){
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void postRequest(){
        System.out.println("Do postRequest");
    }
}
