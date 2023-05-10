import java.util.Map;

public class RegisterReg {

    public void store(String str) {
        Map<String,Integer> map=ShowReg.mapList;
        String[] split = str.split(",");
        String substring = split[1].substring(1);
        int value = Integer.parseInt(substring.toUpperCase());
        String[] s = split[0].split(" ");
        String move=s[0].toUpperCase(),mv=s[1].toUpperCase();
        if(move.equals("MV")) {
            if (map.containsKey(mv)) {
                map.put(mv, map.get(mv) + value);
            } else {
                map.put(mv, value);
            }
        }
    }
}
