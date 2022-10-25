package testpack2;

import java.util.Scanner;

public class TestCls1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println(" adinizi daxil edin");
        String ad= scanner.nextLine();
        System.out.println(" yasinizi daxil edin");
        int yas= scanner.nextInt();


        System.out.println(ad);
        System.out.println(yas);


    }
}
