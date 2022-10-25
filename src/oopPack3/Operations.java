package oopPack3;

public class Operations implements Arifmetik,Mentiqi{
    @Override
    public int topla(int deyer1, int deyer2) {
        int netice=deyer1+deyer2;
        return netice;
    }

    @Override
    public boolean cutdurmu(int eded) {
        boolean result=false;
        if (eded%2==0){
            result=true;
        }
        return result;
    }
}
