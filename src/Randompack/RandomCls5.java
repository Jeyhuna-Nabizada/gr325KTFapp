package Randompack;

import java.util.Random;
import java.util.Scanner;

public class RandomCls5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("uzunluq daxil edin");
        int uzunluq= scanner.nextInt();
        Random random=new Random();

        String sifre="";
        for (int i=0;i<uzunluq;i++){
            int eded= random.nextInt(10);
            sifre+=eded;
        }
        System.out.println(sifre);
    }
}
