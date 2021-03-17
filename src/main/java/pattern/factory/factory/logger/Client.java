package pattern.factory.factory.logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author stormbroken
 * Create by 2021/03/17
 * @Version 1.0
 **/

public class Client {
    private List<LogFactory> logFactories = new ArrayList<>();

    public Client(){
    }
    public void addLog(LogFactory logFactory){
        logFactories.add(logFactory);
    }

    public void write(){
        for(LogFactory logFactory: logFactories){
            Log log = logFactory.createLog();
            log.writerLog();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.addLog(new DatabaseLogFactory());
        client.addLog(new FileLogFactory());
        client.write();
    }
}
