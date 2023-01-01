package ders46_Maps;

import ders44_maps.MapDepo;

import java.util.Map;

public class C03_SoyisimleriBuyukHarfYap {
    public static void main(String[] args) {
        // ogrenci map indeki sayilari buyuk harfe cevirip
        // map in bize donduren bir method olusturun

        Map<Integer, String> ogrenciMapi = MapDepo.ornekMapOlustur();
        ogrenciMapi.put(109,"Adem-Demir-11-D-Soz");

        ogrenciMapi=MapDepo.soyisimleriBuyukHarfYap( ogrenciMapi);

        System.out.println(ogrenciMapi);
    }


}
