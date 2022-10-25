package StrinMetodspack;

import java.util.Scanner;

public class StringTask6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("soz daxil edin");
        String ad= scanner.nextLine();
        String tersad="";
        for (int i=ad.length()-1;i>=0;i--){
            tersad+=ad.charAt(i);

        }
        System.out.println("tersadi "+tersad);

    }
}
