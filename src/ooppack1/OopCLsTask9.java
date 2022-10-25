package ooppack1;

import java.util.Scanner;

public class OopCLsTask9 {
    static boolean checkString(String ad){
        boolean netice = false;
        if(ad.startsWith("A")){
            netice=true;
        }
        return netice;
    }

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Adi daxil edin : ");
        String ad = newScanner.nextLine();

        boolean netice = checkString(ad);
        System.out.println(netice);
    }
}
