package pattern.composite;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public abstract class Component {
    protected String name;
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract Component getChild(int i);
    public abstract void operation();

    public void setName(String name) {
        this.name = name;
    }
}
