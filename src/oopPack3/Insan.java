package oopPack3;

public class Insan {
    private String ad;
    private String soyad;
    private int yash;

    public Insan(String ad, String soyad, int yash) {
        this.ad = ad;
        this.soyad = soyad;
        this.yash = yash;
    }
    public void PrintData(){
        System.out.println(this.ad+" "+this.soyad+" "+ this.yash);
    }
}
