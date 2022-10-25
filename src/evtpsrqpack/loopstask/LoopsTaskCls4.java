package evtpsrqpack.loopstask;

import java.util.Scanner;

public class LoopsTaskCls4 {
    public static void main(String[] args) {
       /* String netice1 ="";

        for (int i=1; i<=4;i++){

            for (int j=1;j<=i;j++){
                netice1+=i;

            }
            netice1+="\n";

        }
        System.out.println(netice1);*/


        String netice1="";
        int say =0;

        for ( int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                netice1+=say;
                say++;
            }
            netice1+="\n";

        }
        System.out.println(netice1);



    }
}
