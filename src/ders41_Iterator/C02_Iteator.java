package ders41_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iteator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        Iterator it1 = sayilar.iterator();
        // tum elementleri iterater kullanarak yazdiralim
        System.out.println(it1.hasNext());
        System.out.println(it1.next());

        System.out.println(it1.hasNext());
        System.out.println(it1.next());


        System.out.println("======================");

        while (it1.hasNext()) {
            System.out.println(it1.next());


            // Iterator nereye kadar iterate ettiysek orada kalır
            // baştan itibaren yazdırmak isterseniz  , yeni bir iterator olusturmanız gerekir

            Iterator it2 = sayilar.iterator();
            System.out.println("============");
            while (it2.hasNext()) {
                System.out.println(it1.next());
            }
        }
    }
}
