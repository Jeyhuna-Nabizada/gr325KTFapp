package Randompack;

import java.util.Scanner;

public class TaskCls1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("uzunluq daxil edin");
        int uzunluq= scanner.nextInt();
        String sifre="";

        for(int i=1;i<uzunluq;i++){

                sifre+="*";

        }
        System.out.println(sifre);

    }
}
