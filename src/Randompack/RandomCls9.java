package Randompack;

import java.util.Random;
import java.util.Scanner;

public class RandomCls9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("uunluq daxil edin");
        int uzunluq= scanner.nextInt();
        int sifre=0;
        Random random=new Random();
        for (int i=0;i<uzunluq;i++ ){
            int eded=random.nextInt();
            sifre+=eded;
        }
        System.out.println(sifre);
    }
}
