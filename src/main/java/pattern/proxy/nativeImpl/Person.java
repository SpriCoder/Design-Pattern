package pattern.proxy.nativeImpl;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public interface Person {
    /**
     * 唱歌
     *
     * @param name
     * @return
     */
    String sing(String name);

    /**
     * 跳舞
     *
     * @param name
     * @return
     */
    String dance(String name);
}
