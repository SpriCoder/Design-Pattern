package pattern.observe;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        MyObserver myObserver1 = new ConcreteObserver();
        subject.attach(myObserver1);
        MyObserver myObserver2 = new ConcreteObserver();
        subject.attach(myObserver2);
        subject.myNotify();
    }
}
