package oopPack3;

public class Toyota extends Car{
    String tPackage;

    @Override
    void start() {
        System.out.println("Toyota starting");
    }

    @Override
    void stop() {
        System.out.println("Toyota stoping");
    }
}
