package ooppack1;

import java.util.Scanner;

public class OopClsTask5 {
    static int quvvettap(int esas,int quvvet){
        int netice=1;
        for (int i=1;i<=quvvet;i++){
            netice*=esas;
        }
        return netice;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("esasi daxil edin");
        int esas= scanner.nextInt();
        System.out.println("quvveti daxil edin");
        int quvvet=scanner.nextInt();
        int netice=quvvettap(esas,quvvet);
        System.out.println(netice);

    }
}
