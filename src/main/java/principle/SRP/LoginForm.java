package principle.SRP;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author stormbroken
 * Create by 2021/03/02
 * @Version 1.0
 **/

public class LoginForm {
    private UserDao userDao = new UserDao();
    private List<String> logs = new ArrayList<>();

    public void init(){
        logs.add("初始化控件成功");
    }

    public void display(){
        logs.add("展示控件成功");
    }

    public void validate(String userName, String userPassword){
        logs.add("通过有效性检验");
        logs.addAll(userDao.findUser(userName, userPassword));
    }

    public List<String> getLogs() {
        return logs;
    }
}
