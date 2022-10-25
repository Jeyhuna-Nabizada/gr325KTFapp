package evtpsrqpack;

import java.util.Scanner;

public class EvtpsrqCls7 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println(" ededi daxil edin");
        int a= scanner.nextInt();
        String netice = "" ;

        if (a%4==0 && a%6==0){
            netice = "bolunur";

        }else {
            netice = "bolunmur";

        }
            System.out.println("eded daxil edin:"+netice);

    }
}
