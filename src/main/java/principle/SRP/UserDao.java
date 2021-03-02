package principle.SRP;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author stormbroken
 * Create by 2021/03/02
 * @Version 1.0
 **/

public class UserDao {
    private DBUtil dbUtil = new DBUtil();

    public List<String> findUser(String userName, String userPassword){
        List<String> logs = new ArrayList<>();
        logs.add(dbUtil.getConnection().getMessage());
        if(userName.equals("admin") && userPassword.equals("123456")){
            logs.add("Admin 登录成功");
        }else{
            logs.add("用户名或密码错误");
        }
        return logs;
    }
}
