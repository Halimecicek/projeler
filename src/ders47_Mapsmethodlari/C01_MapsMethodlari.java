package ders47_Mapsmethodlari;

import java.util.HashMap;
import java.util.Map;

public class C01_MapsMethodlari {
    public static void main(String[] args) {

        Map<String ,Integer>mp1=new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        System.out.println(mp1.putIfAbsent("D", 9)); // null
        System.out.println(mp1);
        System.out.println(mp1.putIfAbsent("D",15));

        /*

         putIfAbsent (K,V) eğer K daha önce yoksa ekler ve null döner
                          eger K daha önce varsa eklemek istediğimiz yeni değeri eklemez
                                 ve eski var olan değeri bize döndürür.


         */


    }
}
