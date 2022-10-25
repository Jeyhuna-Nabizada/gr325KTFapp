package oopPack3;

public class Bmw extends Car{
    String mPackage;

    @Override
    void start() {
        //super.start();
        System.out.println("BMW starting");
    }

    @Override
    void stop() {
        //super.stop();
        System.out.println("BMW stopping");
    }
}
