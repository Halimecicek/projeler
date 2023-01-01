package ders41_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // iterator kullanarak listenin elementlerini sondan basa dogru yazdirin
        ListIterator lit = sayilar.listIterator();
        //
        while (lit.hasNext()){
            lit.next();
        }
      // simdi sondan basa dogru gidelim  giderken elementleri yazdiralim

        while (lit.hasPrevious()){
            System.out.print(lit.hasPrevious()+" ");

            // iterator kullanarak listenin tum elementlerini 5 artirin
            System.out.println("");
            System.out.println(lit.nextIndex());
        }

        while(lit.hasNext()){
            lit.set((Integer)lit.next()+5);
        }

        System.out.println(sayilar);


    }
}
