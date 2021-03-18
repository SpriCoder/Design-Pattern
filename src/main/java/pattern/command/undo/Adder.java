package pattern.command.undo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author stormbroken
 * Create by 2021/03/18
 * @Version 1.0
 **/

public class Adder {
    List<Integer> values = new ArrayList<>();

    public int add(int value){
        values.add(value);
        return values.stream().reduce(Integer::sum).orElse(0);
    }

    public int undo(){
        values.remove(values.size() - 1);
        return values.stream().reduce(Integer::sum).orElse(0);
    }
}
