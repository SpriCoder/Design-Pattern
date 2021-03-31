package pattern.adapter.dog;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class DogAdapter extends Dog implements Robot {
    @Override
    public void cry() {
        wang();
    }

    @Override
    public void move() {
        run();
    }
}
