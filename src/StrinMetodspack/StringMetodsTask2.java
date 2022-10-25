package StrinMetodspack;

import java.util.Scanner;

public class StringMetodsTask2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ad Soyadinizi daxil edin");
        String adsoyad = scanner.nextLine();
        int index= adsoyad.indexOf(" ");
        String soyad = adsoyad.substring(index+1);
        System.out.println("soyadi"+soyad);
    }
}
