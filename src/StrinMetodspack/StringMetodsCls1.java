package StrinMetodspack;

import java.util.Arrays;

public class StringMetodsCls1 {
    public static void main(String[] args) {

      //  String ad ="Turkane Huseynova ";
        // System.out.println(ad.substring(8));
       String ad ="Turkane Huseynova Aqil";
        System.out.println(ad.substring(8,18));


        //String cumle ="Turkane Huseynova";
      //  String[] sozler=cumle.split(" ");

      //  System.out.println(sozler[1]);

        String cumle= "Turkane Huseynova Aqil";
        String[] sozler= cumle.split(" ");
        System.out.println(sozler[1]);

    }
}