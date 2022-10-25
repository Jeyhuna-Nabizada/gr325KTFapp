package Randompack;

import java.util.Random;
import java.util.Scanner;

public class RandomCls3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("eded daxil edin");
        int eded= scanner.nextInt();
        Random random=new Random();
        int reded= random.nextInt(3);
        if (eded==reded){
            System.out.println("tapildi");

        }else {
            System.out.println(" tapilmadi verilen eded "+reded);
        }

    }
}
