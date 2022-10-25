package evtpsrqpack;

import java.util.Scanner;

public class EvtpsrqCls2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ededi daxil edin");
        int a= scanner.nextInt();
        String netice = "";


            if(a%2==0) {

            netice="cut";
        }else {
             netice="tek";

                System.out.println(netice);

         }
    }


}
