package pattern.command.tv;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class Controller {
    private AbstractCommand openCommand;
    private AbstractCommand closeCommand;
    private AbstractCommand changeCommand;

    public Controller(AbstractCommand openCommand, AbstractCommand closeCommand, AbstractCommand changeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeCommand = changeCommand;
    }

    public void open(){
        openCommand.execute();
    }

    public void close(){
        closeCommand.execute();
    }

    public void change(){
        changeCommand.execute();
    }
}
