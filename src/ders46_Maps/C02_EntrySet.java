package ders46_Maps;

import ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        // ogrenci mapinde sirali
        // tum ogrencilerin
        // bolum sinif numara  isim soyisim yazdirin

        Map<Integer, String> ogrenciMapi= MapDepo.ornekMapOlustur();
        ogrenciMapi.put(109,"Adem-Demir-11-D-Soz");
        Set<String > siraliOgrenciListesi=MapDepo.siraliOgrenciOlustur(ogrenciMapi);
        System.out.println(siraliOgrenciListesi);
    }
}
