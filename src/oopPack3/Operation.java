package oopPack3;

public class Operation {
    public void yaz() {
        System.out.println("Nebizade Cahid");
    }

    public Operation() {
        System.out.println("Nebizade Ceyhune");
    }

    public int vurma(int deyer1, int deyer2) {
        int netice = deyer1 * deyer2;
        return netice;
    }

    public int vurma(int deyer1, int deyer2, int deyer3) {
        int netice = deyer1 * deyer2 * deyer3;
        return netice;
    }

    public  int vurma(String  deyer1,String deyer2,String deyer3){
        int netice = Integer.valueOf(deyer1)*Integer.valueOf(deyer2)*Integer.valueOf(deyer3);
        return netice;
    }

}



