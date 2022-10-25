package oopPack3;

public class OperationsMain {
    public static void main(String[] args) {
        Arifmetik oper=new Operations();
        int a=oper.topla(45,55);
        System.out.println(a);

        Mentiqi mentiqi=new Operations();
        boolean b= mentiqi.cutdurmu(67);
        System.out.println(b);
    }
}
