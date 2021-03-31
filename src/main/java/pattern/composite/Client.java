package pattern.composite;

/**
 * @Author stormbroken
 * Create by 2021/03/31
 * @Version 1.0
 **/

public class Client {
    public static void main(String[] args) {
        Component component = new Composite();
        component.setName("component1");
        Component component1 = new Leaf();
        component1.setName("Leaf1");
        Component component2 = new Leaf();
        component2.setName("Leaf2");
        Component component3 = new Composite();
        component3.setName("component2");
        Component component4 = new Leaf();
        component4.setName("Leaf3");
        component3.add(component4);
        Component component5 = new Leaf();
        component5.setName("Leaf4");
        component3.add(component5);
        component.add(component1);
        component.add(component2);
        component.add(component3);
        component.operation();
    }
}
