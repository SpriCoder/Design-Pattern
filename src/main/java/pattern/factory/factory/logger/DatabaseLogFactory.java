package pattern.factory.factory.logger;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class DatabaseLogFactory extends LogFactory{
    @Override
    public Log createLog() {
        return new DatabaseLog();
    }
}
