package Connection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListCls {
    public static void main(String[] args) {

    //o(n),o(1)
    //o(1),o(n)
    List<Integer> list=new LinkedList<>();
    list.add(15);
    list.add(19);
    list.add(14);
    int a =list.get(1);
        System.out.println(a);
    //wrapper
        Iterator<Integer>iterator=list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
}
    }
