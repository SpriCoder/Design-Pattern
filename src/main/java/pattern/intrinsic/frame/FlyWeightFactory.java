package pattern.intrinsic.frame;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author stormbroken
 * Create by 2021/04/07
 * @Version 1.0
 **/

public class FlyWeightFactory {
    private Map<String, FlyWeight> flyWeights = new HashMap<>();
    public FlyWeight getFlyWeight(String key){
        if(flyWeights.containsKey(key)){
            return flyWeights.get(key);
        }else{
            FlyWeight fw;
            if(key.equals("Concrete")){
                fw = new ConcreteFlyWeight(key);
            }else{
                fw = new UnsharedConcreteFlyWeight(key);
            }
            flyWeights.put(key, fw);
            return fw;
        }
    }
}
