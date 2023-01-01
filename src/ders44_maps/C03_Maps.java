package ders44_maps;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapDepo.ornekMapOlustur();
        // 8. satirdan sonra map uzerinde yapacagimiz her degisiklik
        // bu class daki ogrenci map i eklenir

        // map in bu halini bir gorelim
        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz}
         */

        // map a 1 tane yeni element ekleyin
        ogrenciMap.put(110,"Fatih-Yan-10-MF");
        ogrenciMap.put(102,"VeLi-Dem-12-D-Soz");
        System.out.println(ogrenciMap);

        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap,103));
    }
}
