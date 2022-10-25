package evtpsrqpack.loopstask;

import java.util.Scanner;

public class LoopsTaskCls2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int a= scanner.nextInt();
        int netice = 1;

        for ( int i =1;i<=a;i++){
            netice*=i;

        }
        System.out.println(netice );
    }
}
