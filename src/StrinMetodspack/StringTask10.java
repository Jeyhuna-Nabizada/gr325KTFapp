package StrinMetodspack;

import java.util.Scanner;

public class StringTask10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sozu daxil edin");
        String soz= scanner.nextLine();
        boolean netice= soz.startsWith("a");
        System.out.println(netice);
    }
}
