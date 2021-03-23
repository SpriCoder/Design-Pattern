package pattern.template;

/**
 * @Author stormbroken
 * Create by 2021/03/23
 * @Version 1.0
 **/

public class ConcreteClass extends AbstractClass{
    @Override
    public void primitiveOperation2() {
        System.out.println(this.getClass().toString() + " 执行第二步骤");
    }

    @Override
    public void primitiveOperation3() {
        super.primitiveOperation3();
        System.out.println(this.getClass().toString() + " 控制了第三步骤");
    }
}
