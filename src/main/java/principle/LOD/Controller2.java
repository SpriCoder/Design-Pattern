package principle.LOD;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class Controller2 {
    private Dao2 dao2 = new Dao2();
    private Dao3 dao3 = new Dao3();
    private Dao4 dao4 = new Dao4();

    @Override
    public String toString() {
        return "Controller2{" +
                "dao2=" + dao2 +
                ", dao3=" + dao3 +
                ", dao4=" + dao4 +
                '}';
    }
}
