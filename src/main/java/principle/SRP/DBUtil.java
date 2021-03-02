package principle.SRP;

/**
 * @Author stormbroken
 * Create by 2021/03/02
 * @Version 1.0
 **/

public class DBUtil {
    public MyConnection getConnection(){
        MyConnection myConnection = new MyConnection();
        myConnection.setMessage("连接数据库成功");
        return myConnection;
    }
}
