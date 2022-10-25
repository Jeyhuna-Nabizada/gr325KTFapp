package StrinMetodspack;

import java.util.Scanner;

public class StringMetodsTask1 {
    public static void main(String[] args) {
        // [0]Turkane [1]Huseynova [2]Aqil

        Scanner scanner=new Scanner(System.in);

        System.out.println("Ad Soyadinizi  daxil edin");

        String adsoyad=scanner.nextLine();

        String[] massiv=adsoyad.split(" ");

        String soyad =massiv[1];


        System.out.println("soyadi " +soyad);


    }
}
