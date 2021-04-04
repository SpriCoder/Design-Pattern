package pattern.bridge.pen;

/**
 * @Author stormbroken
 * Create by 2021/04/05
 * @Version 1.0
 **/

public class Red implements Color{
    @Override
    public void paint(String penType, String name) {
        System.out.println(penType + " " + this.getClass().toString() + " " + name);
    }
}
