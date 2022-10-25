package StrinMetodspack;

import java.util.Arrays;
import java.util.Scanner;

public class StringTask4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("metni daxil edin");
        String metn= scanner.nextLine();
        String []massiv=metn.split(" ");
        Arrays .sort(massiv);
        for (String soz:massiv){
            System.out.println(soz);
        }
    }
}
