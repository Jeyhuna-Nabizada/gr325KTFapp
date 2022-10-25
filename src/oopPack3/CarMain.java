package oopPack3;

public class CarMain {
    public static void main(String[] args) {
      Car toyota=new Toyota();
      toyota.marka= "Toyota";
      //toyota.start();
     // toyota.stop();

      Car bmw=new Bmw();
      bmw.marka="Bmw";
     // bmw.start();
     // bmw.stop();

      carTesting(toyota);
      carTesting(bmw);
    }

    static void carTesting(Car data){
        System.out.println(data.marka+ " testing");
    }
}
