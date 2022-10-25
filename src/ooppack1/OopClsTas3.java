package ooppack1;

import java.util.Scanner;

public class OopClsTas3 {
    static String bolunurBolunmur(int eded){
        String  netice="";
        if (eded%3==0||eded%4==0){
            netice+="bolunur";
        }else if (eded%3==1||eded%4==1){
            netice+="bolunmur";
        }
        return netice;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int a= scanner.nextInt();
        String netice=bolunurBolunmur(a);
        System.out.println(netice);

    }
}
