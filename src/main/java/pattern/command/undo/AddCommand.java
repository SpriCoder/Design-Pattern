package pattern.command.undo;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class AddCommand extends AbstractCommand{
    private Adder adder = new Adder();

    @Override
    public int execute(int value) {
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.undo();
    }
}
