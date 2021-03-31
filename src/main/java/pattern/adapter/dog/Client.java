package pattern.adapter.dog;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Robot robot = new DogAdapter();
        robot.cry();
        robot.move();
    }
}
