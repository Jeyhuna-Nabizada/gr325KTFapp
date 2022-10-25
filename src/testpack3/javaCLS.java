package testpack3;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class javaCLS {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println(" adinizi daxil edin");
        String ad = scanner.nextLine();
        System.out.println("yasinizi daxil edin" );
         Integer yash = scanner.nextInt();

        System.out.println(ad);
        System.out.println(yash);



    }
}
