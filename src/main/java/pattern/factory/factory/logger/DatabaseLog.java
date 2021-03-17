package pattern.factory.factory.logger;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class DatabaseLog extends Log{
    @Override
    public void writerLog() {
        System.out.println("write DatabaseLog");
    }
}
