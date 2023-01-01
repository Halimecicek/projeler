package ders21_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C06_remov {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};



        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        sayilar.remove(2);
        System.out.println(sayilar);

        /*
         listemiz integerlerden olusuyorsa biz integer deger bir deger yazdigimizda hep index kabul ettiginden
         istedigimiz elementleri obje olarak girip sildirmek icin onceden tanimlamaniz gerekir
         */
        Integer silinecekobje=4;
        sayilar.remove(silinecekobje);
        System.out.println(sayilar);
        // tum 3 leri sildirin
        silinecekobje=3;
        while (sayilar.contains(silinecekobje)){
            sayilar.remove(silinecekobje);

        }
        System.out.println(sayilar);
    }
}
