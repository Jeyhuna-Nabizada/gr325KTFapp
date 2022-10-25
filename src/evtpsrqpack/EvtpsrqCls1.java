package evtpsrqpack;
import java.util.Scanner;

public class EvtpsrqCls1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ededi daxil edin");
        int a = scanner.nextInt();
         int netice = 0;


         if (a>0){
             System.out.println("Musbet eded");
         }else if (a<0){
             System.out.println("Menfi eded");

         }else {
             System.out.println("Sifir");

        }

    }
}
