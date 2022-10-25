package ifswitchpakc;

import java.util.Scanner;

public class IfCls {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin");

        int a = scanner.nextInt();
        System.out.println(" ikinci ededi daxil edin");
        int  b= scanner.nextInt();

        int netice = 0;
        if (a>b){
            netice= a+b;

        }else if (a<b) {
            netice = a - b;
        }else {
            netice=a*b;

            System.out.println(netice);
        }
    }
}
