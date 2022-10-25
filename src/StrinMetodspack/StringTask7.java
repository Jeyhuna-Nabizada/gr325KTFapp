package StrinMetodspack;

import java.util.Scanner;

public class StringTask7 {
    public static void main(String[] args) {

        String soz= "hajhdfuvhabjdudiabjdiudabhdihewd";

        int say=0;

        String []massiv=soz.split("ab");

        say=massiv.length-1;

        System.out.println(say);
    }
}
