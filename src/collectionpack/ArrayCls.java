package collectionpack;

public class ArrayCls {

    public static void main(String[] args) {
        Mobile[] telefonlar = new Mobile[5];
        Mobile tel1 = new Mobile("Samsung", "S20", 2000);
        Mobile tel2 = new Mobile("Iphone", "13promax", 3000);
        Mobile tel3 = new Mobile("Honor", "9X", 500);


        telefonlar[0] = tel1;
        telefonlar[1] = tel2;
        telefonlar[2] = tel3;


       /* for (int i = 0; i<=telefonlar.length - 1;i++){
            System.out.println(telefonlar[i]);

        }*/
        for (Mobile mobile : telefonlar) {
            System.out.println(mobile);
        }
    }
}
