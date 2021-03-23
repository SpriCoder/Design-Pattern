package pattern.observe;

import java.util.ArrayList;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public abstract class Subject {
    protected ArrayList<MyObserver> observers = new ArrayList<>();
    public abstract void attach(MyObserver observer);
    public abstract void detach(MyObserver observer);
    public abstract void myNotify();
}
