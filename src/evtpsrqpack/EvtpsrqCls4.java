package evtpsrqpack;

import java.util.Scanner;

public class EvtpsrqCls4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in );
        System.out.println("bali daxil edin" );
        int bal = scanner.nextInt();


        if(bal>=0 && bal<=100){
            if (0 <= bal && bal <= 50) {
                System.out.println("F");
            } else if (51 <= bal && bal <= 60) {
                System.out.println("E");

            } else if (61 <= bal && bal <= 70) {
                System.out.println("D");

            } else if (71 <=bal && bal <= 80) {
                System.out.println("C");

            } else if (81 <=bal && bal <= 90) {
                System.out.println("B");

            } else if (91 <= bal && bal <= 100) {
                System.out.println("A");

            }

        }else {
            System.out.println("bele bal yoxdur");
        }
    }
}
