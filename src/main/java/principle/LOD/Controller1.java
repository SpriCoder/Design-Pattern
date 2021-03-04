package principle.LOD;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class Controller1 {
    private Dao1 dao1 = new Dao1();
    private Dao2 dao2 = new Dao2();

    @Override
    public String toString() {
        return "Controller1{" +
                "dao1=" + dao1 +
                ", dao2=" + dao2 +
                '}';
    }
}
