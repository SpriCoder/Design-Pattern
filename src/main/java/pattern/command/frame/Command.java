package pattern.command.frame;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public abstract class Command {
    protected Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
    abstract void execute();
}
