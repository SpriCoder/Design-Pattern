package pattern.command.undo;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        AbstractCommand abstractCommand = new AddCommand();
        CalculatorForm calculatorForm = new CalculatorForm();
        calculatorForm.setCommand(abstractCommand);
        calculatorForm.compute(100);
        calculatorForm.compute(200);
        calculatorForm.compute(300);
        calculatorForm.undo();
        calculatorForm.undo();
        calculatorForm.undo();
    }
}
