package evtpsrqpack;

import java.util.Scanner;

public class IfTaskCls8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ilk ededi daxil edin");
        int a= scanner.nextInt();
        System.out.println("son ededi daxil edin");
        int b= scanner.nextInt();
        int cutsay=0;
        int teksay= 0;

        for (int i=a; i<=b; i++){
            if (i%2==0){
                cutsay++;
            }else {
                teksay++;
            }
        }
        System.out.println(cutsay);
        System.out.println(teksay);

    }
}
