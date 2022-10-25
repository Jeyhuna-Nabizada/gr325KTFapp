package ooppack1;

import java.util.Scanner;

public class OopClsTask2 {
    static String bal(int eded) {
        String netice = "";

            if (eded >= 51 && eded <= 60) {
                System.out.println("E");
            } else if (eded >= 61 && eded <= 70) {
                System.out.println("D");
            } else if (eded >= 71 && eded <= 80) {
                System.out.println("C");
            } else if (eded >= 81 && eded <= 90) {
                System.out.println("B");
            } else if (eded >= 91 && eded <= 100) {
                System.out.println("A");
            }


             return netice;
            }
             public static void main(String[] args) {
             Scanner scanner=new Scanner(System.in);
             System.out.println("bali daxil edin");
              int a= scanner.nextInt();
             String netice=bal(a);
             System.out.println(netice);

    }
}
