package ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<>();

        ll1.add("K");
        ll1.add("D");

       /*LinkedList 3 tane interface'i implament etmiştir
        1- List , 2- Queue , 3- Deque interface'leri
        Dolayısıyla bu interface'lerden sonra gelen ilk concrete class oldugundan
        bu interface'deki tum abstract method'ları override etmıstır
        LinkedList olusturulurken secılen daha turune gore bu 3
        ınterface'den birinin ozelıklerını alabılır
        veya data turu LinkedList seçilirse ,   interface'in özelliklerini de toptan alır
                */




        List<String> ll2=new LinkedList<>();
          /* Daha önceden arrayList olustururken List<> interface'ini data türü olarak
        kullandıgımızdan bu sekılde olusturulan LinkedList'lerin ozellıklerını biliyoruz.
         */

        ll2.add("R"); // [R]
        ll2.add("Z");
        ll2.add(0,"A");
        ll2.addAll(2,ll1);
        ll2.set(3,"M");
        System.out.println(ll2.get(1));
        ll2.retainAll(ll1);
        System.out.println(ll2);
        ll2.add("A");
        System.out.println(ll2.hashCode());

        System.out.println(ll2.subList(2,4)); // 2 dahil 4 dahil olmadigindan exception firlatmaz


    }
}
