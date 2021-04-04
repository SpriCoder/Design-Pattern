package pattern.bridge.pen;

/**
 * @Author stormbroken
 * Create by 2021/04/05
 * @Version 1.0
 **/

public class SmallPen extends Pen{
    @Override
    public void draw(String name) {
        color.paint("SmallPen", name);
    }
}
