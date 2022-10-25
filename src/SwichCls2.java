import java.util.Scanner;

public class SwichCls2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Ayi daxil edin");
        String fesil = scanner.nextLine();

        switch (fesil){
            case"Dekabar":
            case"Yanvar" :
            case"Fevaral":
                System.out.println("Qis");
                break;
            case"Mart":
                System.out.println("Yaz");
                break;
            case"Aprel":
                System.out.println("Yaz");
                break;
            case"May":
                System.out.println("Yaz");
                break;
            case"Iyun":
                System.out.println("Yay");
                break;
            case"Iyul":
                System.out.println("Yay");
                break;
            case"Avqust":
                System.out.println("Yay");
                break;
            case"Sentyabr":
                System.out.println("Payız");
                break;
            case"Oktyabr":
                System.out.println("Payız");
                break;
            case"Noyabr":
                System.out.println("Payız");
                break;
            default:
                System.out.println(" bele fesil yoxdur");

        }

    }
}
