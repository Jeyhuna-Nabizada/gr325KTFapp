package ooppack1;

import java.util.Scanner;

public class OopClsTask1 {
    static String musbetMenfi(int eded) {
        String netice="";
        if (eded>0){
            netice+="musbet";
        }else if (eded<0){
            netice+="menfi";
        }else {
            netice+="sifir";
        }
        return netice;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int a= scanner.nextInt();
        String netice=musbetMenfi(a);
        System.out.println(netice);


    }

}
