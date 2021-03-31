package pattern.composite;

import java.util.ArrayList;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class Composite extends Component{
    private ArrayList<Component> list = new ArrayList<>();
    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        System.out.println(name);
        for(Component component : list){
            component.operation();
        }
    }
}
