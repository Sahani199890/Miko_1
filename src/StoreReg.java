import java.util.Map;

public class StoreReg {

    Utils utils=new Utils();
    SingleTonMap singleTonMap=SingleTonMap.getInstance();
    Map<String ,Integer> map=singleTonMap.getMap();
    public void store(String key, String value)  {
        if(value.startsWith("#")) {
            int val=Integer.parseInt(value.substring(1));
            if (map.containsKey(key)){
                map.put(key,map.get(key)+val);
            }
            else{
                map.put(key,val);
            }
        }
        utils.writeMethod(map);
    }
    public void store1(String key, String value){
        if(Character.isAlphabetic(value.charAt(0)) && map.containsKey(value)){
            map.put(key,map.get(value)+map.get(key));
        }
        else if(Character.isDigit(value.charAt(0))) {
             if (map.containsKey(key)) {
                 map.put(key, Integer.parseInt(value) + map.get(key));
             } else {
                 map.put(key, Integer.parseInt(value));
             }
         }
        utils.writeMethod(map);
    }
}
