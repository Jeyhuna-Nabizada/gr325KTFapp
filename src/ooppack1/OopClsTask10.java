package ooppack1;

import java.util.Scanner;

public class OopClsTask10 {
    static int kodlarinCemi(String soz){
        int cem = 0;
        for(int i = 0 ; i<=soz.length()-1;i++){
            int kod = soz.charAt(i);
            cem+=kod;
        }
        return cem;
    }

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Sozu daxil edin : ");
        String soz = newScanner.nextLine();

        int a = kodlarinCemi(soz);
        System.out.println(a);
    }
}
