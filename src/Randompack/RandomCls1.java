package Randompack;

import java.util.Random;

public class RandomCls1 {
    public static void main(String[] args) {
      String []adlar=new String[11];
        adlar[0]="Immi";
        adlar[1]="Ceyhune";
        adlar[2]="Ferec";
        adlar[3]="Raul";
        adlar[4]="Vahid";
        adlar[5]="Elvin";
        adlar[6]="Elnur";
        adlar[7]="Yusif";
        adlar[8]="Elnur";
        adlar[9]="Vusal";
        adlar[10]="Emil";
        Random random=new Random();
        int index= random.nextInt(adlar.length);
        System.out.println(adlar[index]);
    }
}
