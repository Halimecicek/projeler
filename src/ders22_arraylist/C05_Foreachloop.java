package ders22_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C05_Foreachloop {
    public static void main(String[] args) {
        // Verilen String bir array’deki her bir elementi kontrol edip,
        // - Kelimenin uzunlugu cift sayi ise ilk yarisini
        // - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        // yeni bir listeye ekleyip yazdirin.
        String[] arr = {"sumeyra", "mehmet", "ekrem", "yilmaz", "ayse"};
        List<String> yenilist = new ArrayList<>();
        for (String each : arr
        ) {
            if (each.length() % 2 == 0) {


              yenilist.add(each.substring(0,each.length()/2));

            } else {
                yenilist.add( each.substring(each.length()-1/2));
            }
        }
        System.out.println(yenilist);
    }
}