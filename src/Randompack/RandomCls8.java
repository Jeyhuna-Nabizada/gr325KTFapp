package Randompack;

import java.util.Random;
import java.util.Scanner;

public class RandomCls8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("uzunluq daxil edin");
        int uzunluq = scanner.nextInt();
        String metn = "ABCDEFGHLMNOPKUWVZ";

        Random random = new Random();

        String sifre = "";
        for (int i = 0; i < uzunluq; i++) {
            int teyin = random.nextInt(2);
            if (teyin == 0) {
                int eded = random.nextInt(10);
                sifre += eded;
            } else {
                int index = random.nextInt(metn.length());
                sifre += metn.charAt(index);

            }

        }
            System.out.println(sifre);
    }
}
