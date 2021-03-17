package pattern.factory.abstractfactory;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class Client {
    private Factory factory;
    private AbstractProductA abstractProductA;
    private AbstractProductB abstractProductB;

    public Client(Factory factory){
        this.factory = factory;
    }

    public void info(){
        if(abstractProductA == null){
            abstractProductA = factory.createProductA();
        }
        if(abstractProductB == null){
            abstractProductB = factory.createProductB();
        }
        System.out.println(abstractProductA.name());
        System.out.println(abstractProductB.name());
    }

    public static void main(String[] args) {
        Client client1 = new Client(new ConcreteFactory1());
        client1.info();
        Client client2 = new Client(new ConcreteFactory2());
        client2.info();
    }
}
