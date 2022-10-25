package evtpsrqpack;

import java.util.Scanner;

public class EvtpsrqCls3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int a= scanner.nextInt();

        int netice =0;


          if (a%3==0 || a%4==0  ){
              System.out.println("3-e ve ya 4-e bolunur");

          }else if (a%3==1 || a%4==1){
              System.out.println("3-e ve ya 4-e bolunmur");

          }else {
              System.out.println(netice );
          }







    }
}
