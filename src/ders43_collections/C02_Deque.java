package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        Deque<String>urunler=new LinkedList<>();
        urunler.add("Nutella");
        urunler.add("oreo");
        urunler.add("Milka");
        // tum urunlerin basina "y" ekleyelim

        String eleman="";
        Deque gececiDegue=new LinkedList();
        while (eleman!=null){

            eleman= urunler.poll();
            if (eleman!=null){
                eleman="Y"+eleman;
                gececiDegue.add(eleman);

            }
        }
        urunler=gececiDegue;
        System.out.println(urunler);
    }
}
