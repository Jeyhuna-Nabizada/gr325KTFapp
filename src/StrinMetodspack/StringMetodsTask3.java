package StrinMetodspack;

import java.util.Scanner;

public class StringMetodsTask3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ad soyad ata adi daxil edin");
        String adsoyadataadi= scanner.nextLine();
        int index= adsoyadataadi.indexOf(" ");
        int lindex=adsoyadataadi.lastIndexOf(" ");
        String soyad = adsoyadataadi.substring( index+1,lindex);
        System.out.println("soyadi"+soyad);
    }
}
