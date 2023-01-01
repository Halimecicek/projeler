package ders44_maps;

import java.util.Map;

public class C02_Maps {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=MapDepo.ornekMapOlustur();
        ogrenciMap.put(105,"Hasan-can-11-K-MF");
        ogrenciMap.put(108,"Hikmet-Han-10-M--TM");
        /*
        Eger map de olan bir key ile yeni bir deger eklerseniz
        o key e ait var olan value silinir ve yeni value gecerli olur
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        108,"Hikmet-Han-10-M--TM}

         */
        // 108 numarali ogrenci isim soy isim yazdirin

        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap,108));

        // 104 numarali ogrencinin subesini K yapin
        // method da istenen key map de varsa degistirip map i geri dondurelim
        // yoksa hic bir islem yapmadan map


        int ogrenciKey=109;
        String yeniSube="K";
       ogrenciMap= MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,ogrenciKey,yeniSube);
        System.out.println(ogrenciMap);
    }
}
