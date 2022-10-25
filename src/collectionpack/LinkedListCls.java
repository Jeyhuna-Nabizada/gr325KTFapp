package collectionpack;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCls {
    public static void main(String[] args) {
        List<String>sheherler=new LinkedList<>();
        sheherler.add("Baku");
        sheherler.add("Ganja");
        sheherler.add("Zakatala");

        for(String item:sheherler){
            System.out.println(item);
        }
    }
}
