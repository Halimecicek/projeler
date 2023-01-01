package ders45_maps;

import ders44_maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {
        // ogrenciler mapinde subesi H olan ogrencilerin isim soyisim ve siniflarini yazdiralim

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        Set<Integer> ogrencikeyset=ogrenciMap.keySet(); // bir map deki keyleri set olarak dondurur
        System.out.println(ogrencikeyset);
        Collection<String>ogrenciValueCollection=ogrenciMap.values();
        System.out.println(ogrenciValueCollection);
    }
}
