package ooppack1;

import java.util.Scanner;

public class OopClsTask8 {
    static String tersAd(String ad){
        String netice = "";
        for(int i=ad.length()-1;i >= 0 ; i--){
            netice+=ad.charAt(i);
        }
        return netice;
    }

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Adi daxil edin : ");
        String ad = newScanner.nextLine();

        String netice = tersAd(ad);
        System.out.println(netice);
    }
}
