package Randompack;

import java.util.Random;
import java.util.Scanner;

public class RandomCls4 {
    public static void main(String[] args) {


        String ad="Lale";
        Random random=new Random();
        int index= random.nextInt(ad.length());
        System.out.println(ad.charAt(index)+" indexi "+index);

    }
}
