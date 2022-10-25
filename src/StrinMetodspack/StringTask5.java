package StrinMetodspack;

import java.util.Scanner;

public class StringTask5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sozu daxil edin");
        String soz= scanner.nextLine();
        int say =0;
        for (int i=0;i<=soz.length()-1;i++){
            if(soz.charAt(i)=='a' || soz.charAt(i)=='i'|| soz.charAt(i)=='e'){
                say++;

            }

        }
        System.out.println(say);
    }
}
