package pattern.command.undo;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void compute(int value){
        System.out.println(command.execute(value));
    }

    public void undo(){
        System.out.println(command.undo());
    }
}
