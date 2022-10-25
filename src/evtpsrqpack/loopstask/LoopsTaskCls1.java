package evtpsrqpack.loopstask;

import java.util.Scanner;

public class LoopsTaskCls1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ilk ededi daxil edin");
        int a= scanner.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int b = scanner.nextInt();
        int bolunencem=0;
        int bolunensay=0;

        for (int i=a ; i<=b;i++ ){
            if (i%3==0 || i%4==0){
                bolunensay ++;
                bolunencem+=i;
            }
        }
        System.out.println(bolunencem);
        System.out.println(bolunensay);
    }
}
