package StrinMetodspack;

import java.util.Scanner;

public class StringTask8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("birinci sozu daxil edin");
        String soz1= scanner.nextLine();
        System.out.println("ikinci sozu daxil edin");
        String soz2= scanner.nextLine();
         char son= soz1.charAt(soz1.length()-1);
         char evvel=soz2.charAt(0);
        System.out.println(son);
        System.out.println(evvel);
        boolean netice =false;
        if (son==evvel){
            netice=true;

        }
        System.out.println(netice);

    }
}
