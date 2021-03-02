package principle.SRP;

/**
 * @Author stormbroken
 * 模拟单一职责原则
 * Create by 2021/03/02
 * @Version 1.0
 **/

public class MainClass {
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.init();
        loginForm.display();
        loginForm.validate("admin", "123456");
        System.out.println(String.join("\n", loginForm.getLogs()));
    }
}
