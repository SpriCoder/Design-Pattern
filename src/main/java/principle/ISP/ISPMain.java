package principle.ISP;

/**
 * @Author stormbroken
 * Create by 2021/03/04
 * @Version 1.0
 **/

public class ISPMain {
    public static void main(String[] args) {
        AbstractServiceA abstractServiceA = new ClientA();
        abstractServiceA.operatorA();
        AbstractServiceB abstractServiceB = new ClientB();
        abstractServiceB.operatorB();
        AbstractServiceC abstractServiceC = new ClientC();
        abstractServiceC.operatorC();
        ConcreteService concreteService = new ConcreteService();
        concreteService.operatorA();
        concreteService.operatorB();
        concreteService.operatorC();
    }
}
