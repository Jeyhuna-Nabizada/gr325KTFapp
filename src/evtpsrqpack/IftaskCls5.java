package evtpsrqpack;

import java.util.Scanner;

public class IftaskCls5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner( System.in);
        System.out.println("esas meblegi daxil edin");
        Double esas= scanner.nextDouble();
        double ferq=0;
        double odenilecek = 0;

        if( esas>0 && esas<=300){

            ferq= esas* 0.05 ;

        }else if(esas>300&&  esas<=500){
            ferq= esas*0.1;
        }else if(esas>500 && esas<=700){
            ferq= esas*0.15;

        }else {
            ferq= esas*0.2;

        }
        odenilecek= esas-ferq;
        System.out.println("odenilecek mebleg :"+ odenilecek);
    }
}
