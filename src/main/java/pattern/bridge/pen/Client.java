package pattern.bridge.pen;

/**
 * @Author stormbroken
 * Create by 2021/04/05
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Pen pen1 = new BigPen();
        Pen pen2 = new MiddlePen();
        Pen pen3 = new SmallPen();

        Color color1 = new Red();
        Color color2 = new Blue();
        Color color3 = new Green();
        Color color4 = new White();
        Color color5 = new Black();

        pen1.setColor(color1);
        pen1.draw("draw1");
        pen2.setColor(color3);
        pen2.draw("draw2");
        pen3.setColor(color5);
        pen3.draw("draw3");
    }
}
