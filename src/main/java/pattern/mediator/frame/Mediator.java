package pattern.mediator.frame;

import java.util.ArrayList;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public abstract class Mediator {
    protected ArrayList<College> colleges = new ArrayList<>();
    public void register(College college) {
        colleges.add(college);
    }
    public abstract void operation();
}
