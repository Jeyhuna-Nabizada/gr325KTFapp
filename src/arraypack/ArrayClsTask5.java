package arraypack;

import java.util.Scanner;

public class ArrayClsTask5 {
            public static void main(String[] args) {
                Scanner eded = new Scanner(System.in);
                System.out.println("eded daxil edin");
               int a= eded.nextInt();

            int[]ededler = new int[10];
                ededler[0]=5;
                ededler[1]=8;
                ededler[2]=19;
                ededler[3]=15;
                ededler[4]=19;
                ededler[5]=23;
                ededler[6]=27;
                ededler[7]=35;
                ededler[8]=45;
                ededler[9]=55;
                int netice=0;



                for(int i = 0; i<= ededler.length-i;i++){
                    if( ededler[i]== a) {
                        netice+=ededler[i] ;
                        System.out.println("var");


                    }else {
                        netice+=ededler[i];
                        System.out.println("yoxdur");

                    }

                }
                         System.out.println(netice);
            }
        }

