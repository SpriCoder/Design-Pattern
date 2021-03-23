package pattern.observe;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public class ConcreteSubject extends Subject{
    @Override
    public void attach(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(MyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void myNotify() {
        for(MyObserver myObserver : observers){
            myObserver.update();
        }
    }
}
