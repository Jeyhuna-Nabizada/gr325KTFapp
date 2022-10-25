package evtpsrqpack;

import java.util.Scanner;

public class IfTaskCls6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ilk ededi daxil edin ");
        int a = scanner.nextInt();
        System.out.println("son ededi daxil edin ");
        int b = scanner.nextInt();
        int cutcem =0;
        int tekcem = 0;

        for (int i= a;i<=b;i++){

               if(i%2==0){
                cutcem+=i;
            }else {
                tekcem+=i;
            }

        }
        System.out.println(cutcem);
        System.out.println(tekcem);


    }
}
