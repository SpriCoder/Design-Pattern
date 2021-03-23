package pattern.template;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public abstract class AbstractClass {
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        primitiveOperation3();
    }
    // 具体方法
    public void primitiveOperation1(){
        System.out.println(this.getClass().toString() + " 执行第一步骤");
    }
    // 抽象方法
    public abstract void primitiveOperation2();
    // 钩子方法
    public void primitiveOperation3(){

    }
}
