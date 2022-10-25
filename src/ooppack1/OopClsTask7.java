package ooppack1;

import java.util.Scanner;

public class OopClsTask7 {
    static int aeiLerinSayi(String soz){
        int say=0;
        for(int i=0; i<=soz.length()-1;i++){
            if(soz.charAt(i)=='a'||soz.charAt(i)=='i'||soz.charAt(i)=='e'){
                say++;
            }
        }
        return say;
    }

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Sozu daxil edin : ");
        String word = newScanner.nextLine();

        int cavab = aeiLerinSayi(word);
        System.out.println(cavab);

    }
}
