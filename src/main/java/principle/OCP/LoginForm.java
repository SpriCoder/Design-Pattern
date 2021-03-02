package principle.OCP;

/**
 * @Author stormbroken
 * Create by 2021/03/02
 * @Version 1.0
 **/

public class LoginForm {
    private AbstractButton abstractButton;

    public void setAbstractButton(AbstractButton abstractButton) {
        this.abstractButton = abstractButton;
    }

    public void display(){
        abstractButton.view();
    }
}
