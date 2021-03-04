package principle.CRP;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class DBUtil {
    MyConnection getConnection(){
        return new MyConnection("DBUtil: MyConnection connect success!");
    }
}
