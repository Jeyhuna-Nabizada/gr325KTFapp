package ifswitchpakc;

import java.util.Scanner;

public class IfCls2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("adinizi daxil edin");
        String name = scanner.nextLine();
        String surname = "";

        if (name.equals("Gunel")){
            surname ="Huseynova";

        }else if (name.equals("Aysel")){
            surname=" Amiraslanova";

        }else {
            System.out.println("not fround");

        }
        System.out.println(surname);


    }
}
