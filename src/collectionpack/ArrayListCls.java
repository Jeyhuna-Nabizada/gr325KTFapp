package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCls {

    public static void main(String[] args) {
        List<Mobile>telefonlar=new ArrayList<>();
        Mobile tel1= new Mobile("Samsung","S20",200);
        Mobile tel2= new Mobile("Iphone","13promax",3000);
        Mobile tel3= new Mobile("Honor","9X",500);

        telefonlar.add(tel1);
        telefonlar.add(tel2);
        telefonlar.add(tel3);
        Mobile tel4= new Mobile("Huavei","P40lite",300);
        telefonlar.add(1,tel4);

        for(Mobile mobile:telefonlar){
            System.out.println(mobile);

        }
       System.out.println(telefonlar.size());
       System.out.println(telefonlar.isEmpty());
       // telefonlar.clear();
       System.out.println(telefonlar.isEmpty());
        System.out.println(telefonlar.get(2));
    }
}
