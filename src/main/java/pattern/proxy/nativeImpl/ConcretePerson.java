package pattern.proxy.nativeImpl;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class ConcretePerson implements Person {
    /**
     * 唱歌
     *
     * @param name
     * @return
     */
    @Override
    public String sing(String name) {
        System.out.println("ConcretePerson sing " + name + "!");
        return "Finish Singing!";
    }

    /**
     * 跳舞
     *
     * @param name
     * @return
     */
    @Override
    public String dance(String name) {
        System.out.println("ConcretePerson dance " + name + "!");
        return "Finish Dancing!";
    }
}
