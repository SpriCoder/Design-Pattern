package pattern.command.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command=command;
    }
    public void setCommand(Command command){
        this.command=command;
    }
    /**
     * 业务方法，用于调用命令类的方法
     */
    public void call(){
        System.out.println("Invoker!");
        command.execute();
    }
}
