package principle.CRP;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class NewDBUtil extends DBUtil{
    @Override
    MyConnection getConnection(){
        return new MyConnection("NewDBUtil: MyConnection connect success!");
    }
}
