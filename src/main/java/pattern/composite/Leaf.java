package pattern.composite;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class Leaf extends Component{
    @Override
    public void add(Component c) {
        System.out.println("Error!");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Error!");
    }

    @Override
    public Component getChild(int i) {
        System.out.println("Error!");
        return null;
    }

    @Override
    public void operation() {
        System.out.println(name + " operate!");
    }
}
