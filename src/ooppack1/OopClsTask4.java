package ooppack1;

import java.util.Scanner;

public class OopClsTask4 {
     static int factorial(int a){
         int netice=1;

         for (int i=1;i<=a;i++){
             netice*=i;

         }
         return netice;
     }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int b= scanner.nextInt();
        int netice=factorial(b);
        System.out.println(netice);

    }
}
