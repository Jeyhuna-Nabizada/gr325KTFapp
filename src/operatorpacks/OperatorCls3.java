package operatorpacks;

import java.util.Scanner;

public class OperatorCls3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin");
        int a = scanner.nextInt();
        System.out.println(" Iikinci ededi daxil edin ");
        int b= scanner.nextInt();
        System.out.println("Ucuncu ededi daxil edin");
        int c = scanner.nextInt();
        System.out.println("Dorduncu ededi daxil edin");
        int d = scanner.nextInt();

        boolean netice  = a>b || c<=d;
        System.out.println(netice);
    }
}
