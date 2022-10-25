package collectionpack;

import java.util.HashMap;

public class HashMapCls {
    public static void main(String[] args) {
        HashMap<Integer,String>seriyalar=new HashMap<>();
        seriyalar.put(62,"Zaqatala");
        seriyalar.put(21,"Gedebey");
        seriyalar.put(90,"Baku");
        seriyalar.put(20,"Ganja");
        seriyalar.put(null,"Naxcivan");

        System.out.println(seriyalar.get(90));
        System.out.println(seriyalar.get(null));
        System.out.println(seriyalar.isEmpty());
        System.out.println(seriyalar.containsKey(21));
        System.out.println(seriyalar.containsValue("Lenkaran"));



        for (Integer key:seriyalar.keySet()){
            System.out.println(key);
        }

        for (String value:seriyalar.values()){
            System.out.println(value);
        }
    }
}
