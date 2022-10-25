package operatorpacks;

import java.util.Scanner;

public class OperatorCls4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Birinci ededi daxil edin");
        int a= scanner.nextInt();
        System.out.println("Ikinci ededi daxil edin");
        int b= scanner.nextInt();
        System.out.println("Ucuncu ededi daxil edin");
        int c = scanner.nextInt();
        System.out.println("Dorduncu ededi daxil edin");
        int d= scanner.nextInt();

        String result = ( a>=b || c<d)? "dogru": " yalnis";
        System.out.println(result);
    }
}
