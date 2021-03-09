package pattern.strategy.basic;

/**
 * @Author stormbroken
 * Create by 2021/03/09
 * @Version 1.0
 **/

public class Context {
    private Strategy strategy = new ConcreteStrategyA();

    public void algorithm(String type){
        if(type.equals("strategyA")) {
            this.strategy = new ConcreteStrategyA();
        } else if(type.equals("strategyB")) {
            this.strategy = new ConcreteStrategyB();
        } else if(type.equals("strategyC")) {
            this.strategy = new ConcreteStrategyC();
        }else{
            System.out.println("Error!");
        }
        this.strategy.AlgorithmInterface();
    }

    public static void main(String[] args) {
        Context context = new Context();
        context.algorithm("strategyA");
        context.algorithm("strategyB");
        context.algorithm("strategyC");
        context.algorithm("strategyD");
    }
}
