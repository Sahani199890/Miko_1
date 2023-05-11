import java.io.*;
import java.util.Map;

public class Utils {
    SingleTonMap singleTonMap=SingleTonMap.getInstance();
    Map<String ,Integer> map=singleTonMap.getMap();
    String path="C:\\Users\\Administrator\\Desktop\\File Handling\\Assignment_1.txt";
    public String[] check(String str) {
        String[] ans=new String[3];
        String[] split = str.split(",");
        String value=split[1].trim().toUpperCase();
        String[] s = split[0].split(" ");
        ans[0]=s[1];
        ans[1]=value;
        ans[2]=s[0];
        return ans;
    }
    void reRead(){
        String readLine = readMethod();
        if(readLine!=null) {
            String[] s = readLine.split(",");
            for(int i=0;i< s.length;i++){
                String[] split = s[i].split("=");
                if(map.containsKey(split[0])) {
                    map.put(split[0], map.get(split[0]) + Integer.parseInt(split[1]));
                }
                else{
                    map.put(split[0],Integer.parseInt(split[1]));
                }
            }
        }
    }
    void writeMethod(Map<String,Integer> map) {
        PrintWriter printWriter;
        FileWriter fileWriter ;
        File file = new File(path);
        try {
            fileWriter = new FileWriter(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        printWriter = new PrintWriter(fileWriter);
        for(Map.Entry<String ,Integer> val:map.entrySet()){
            printWriter.write(val.getKey()+"="+val.getValue()+",");
        }
        printWriter.flush();
    }
    String readMethod(){
        File file = new File(path);
        Reader reader;
        try {
            reader=new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(reader);
        String readLine = null;
        try {
            readLine = bufferedReader.readLine();
            if(readLine!=null) {
                return readLine;
            }return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
