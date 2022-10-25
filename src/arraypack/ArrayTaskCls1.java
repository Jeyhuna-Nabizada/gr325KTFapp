package arraypack;

public class ArrayTaskCls1 {
    public static void main(String[] args) {
        int[] ededler = new int[10];
        ededler[0] = 10;
        ededler[1] = 20;
        ededler[2] = 45;
        ededler[3] = 37;
        ededler[4] = 57;
        ededler[5] = 69;
        ededler[6] = 9;
        ededler[7] = 15;
        ededler[8] = 27;
        ededler[9] = 75;
        int cutcem = 0;
        int tekcem = 0;
        int cutsay = 0;
        int teksay = 0;

        for (int i = 0; i <= ededler.length - 1; i++) {
            if (ededler[i] % 2 == 0) {
                cutcem += ededler[i];
                cutsay++;

            } else {
                tekcem += ededler[i];
                teksay++;
            }


        }
        System.out.println(cutcem);
        System.out.println(tekcem);
        System.out.println(cutsay);
        System.out.println(teksay);


    }
}
