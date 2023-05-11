import java.util.HashMap;
import java.util.Map;

public class SingleTonMap {
    private SingleTonMap(){}
    private static SingleTonMap instanceMap;
    Map<String,Integer> map=new HashMap<>();
    public static SingleTonMap getInstance(){
        if(instanceMap==null){
            instanceMap=new SingleTonMap();
        }
        return instanceMap;
    }
    public Map<String,Integer> getMap(){
        return map;
    }

}
