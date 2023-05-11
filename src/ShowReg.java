import java.util.HashMap;
import java.util.Scanner;

public class ShowReg {

    void show(){
        Utils utils = new Utils();
        System.out.println(utils.readMethod());
    }
    static void verify(){
        for (;;) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine().toUpperCase();
            if(str.contains("ADD")){
                Utils util = new Utils();
                String[] checked = util.check(str);
                if(checked[2].equals("ADD")) {
                    StoreReg storeReg = new StoreReg();
                    storeReg.store1(checked[0], checked[1]);
                }
            }
            else if(str.equals("SHOW REG")){
                ShowReg showReg = new ShowReg();
                showReg.show();
            }
            else if(str.contains("MV")){
                Utils util = new Utils();
                String[] checked = util.check(str);
                if(checked[2].equals("MV")) {
                    StoreReg storeReg = new StoreReg();
                    storeReg.store(checked[0], checked[1]);
                }
            }
            else if(str.equals("EXIT")){
                System.exit(0);
            }
        }
    }

}
