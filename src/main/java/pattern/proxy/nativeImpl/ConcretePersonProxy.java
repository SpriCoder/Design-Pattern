package pattern.proxy.nativeImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class ConcretePersonProxy {
    private Person person = new ConcretePerson();

    /**
     * 返回代理对象
     *
     * @return
     */
    public Person getProxy(){
        return (Person) Proxy.newProxyInstance(ConcretePersonProxy.class.getClassLoader(),
                person.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * 直接使用内部的匿名类来实现接口，是针对InvocationHandler接口的匿名实现类
                     * 在invoke方法编码指定返回的代理对象干的工作，实际上调用person.sing方法的调用的invoke中的代码
                     * @param proxy 代理对象自己
                     * @param method 代理对象当前调用的方法
                     * @param args 把方法参数传递进来
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if(method.getName().equals("sing")){
                            System.out.println("I am Proxy, I will tell ConcretePerson to sing!");
                            return method.invoke(person, args);
                        }
                        if(method.getName().equals("dance")){
                            System.out.println("I am Proxy, I will tell ConcretePerson to dance!");
                            return method.invoke(person, args);
                        }
                        return null;
                    }
                });
    }
}
