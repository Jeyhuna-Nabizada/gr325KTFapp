package StrinMetodspack;

import java.util.Locale;

public class StringMetodsCls {
    public static void main(String[] args) {
        String name= "Ayla";
       // System.out.println(name.length());
        char herf= name.charAt(name.length()-1);
       // System.out.println(herf);
        String metn ="Qarabag Azerbaycanin erazisidir";
        boolean result= metn.endsWith("erazi");
      //  System.out.println(result);
        boolean result1=metn.startsWith("Qar");
       // System.out.println(result1);
        //System.out.println(metn.contains("alma")); //(hemin sozun metinde olub ol,adigini gosderir)
        String a= "alma";
        String b= "Alma";
        int result2=a .compareTo(b);
       // System.out.println(result2);
        int result3=a.compareToIgnoreCase(b);
        //System.out.println(result3);
        boolean result4=a.equals(b);
        //System.out.println(result4);
        boolean result5=a.equalsIgnoreCase(b);
       // System.out.println(result5);
        String ad ="Qafqaz Abbasov";
        int index= ad.indexOf("a",5);
        //System.out.println(index);
        int lindex= ad.lastIndexOf("a");//axirdan bawlayir
        //System.out.println(index);

       // System.out.println(ad.toUpperCase());
       // System.out.println(ad.toLowerCase());
       // System.out.println(ad.trim());
      //  System.out.println(ad.substring(2));
       // System.out.println(ad.substring(7,9));
       // System.out.println(ad.replace('a','o'));
       // System.out.println(ad.replace("fq","kj"));

        String cumle ="kjkjkh@dghfhs@hdh@";
        String[]sozler=cumle.split("@",2);
        //System.out.println(sozler[1]);
      //  System.out.println("-------------");
        for (String soz:sozler){
           // System.out.println(soz);
        }


    }
}
