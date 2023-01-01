package ders44_maps;

import javax.swing.*;
import java.util.*;

public class MapDepo {


    // ogrencimap olusturup bize donduren
    public static Map<Integer, String> ornekMapOlustur() {
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-10-H-MF");
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        ogrenciMap.put(103, "Ali-Cem-11-H-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Ayse-Cem-11-M-TM");
        ogrenciMap.put(106, "Fatma-Han-10-K-Soz");

        return ogrenciMap;
    }

    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {

        String ogrenciValue = ogrenciMap.get(ogrenciKey);

        String[] valueArr = ogrenciValue.split("-");
        String isimSoyisim = valueArr[0] + " " + valueArr[1];
        return isimSoyisim;

    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey, String yeniSube) {
        // ogrenci key

        if (ogrenciMap.containsKey(ogrenciKey)) {
            // istenen key varsa update edip yeni mapi dondurecegiz

            String istenenKeyinValuesu = ogrenciMap.get(ogrenciKey);
            String[] istenenKeyvalueArr = istenenKeyinValuesu.split("-");
            // yeni sube degerini atayalim
            istenenKeyvalueArr[3] = yeniSube;
            String istenenkeyinYeniValuesu = istenenKeyvalueArr[0] + "-+" +
                    istenenKeyvalueArr[1] + "-+" +
                    istenenKeyvalueArr[2] + "-+" +
                    istenenKeyvalueArr[3] + "-+" +
                    istenenKeyvalueArr[4];
            ogrenciMap.put(ogrenciKey, istenenkeyinYeniValuesu);


        }
        return ogrenciMap;
    }

    public static List<String> numaraDegerineGoreListeolustur(Map<Integer, String> ogrenciMap, int baslangicno, int bitisno) {
        // hem key hem value lazim oldugundan keyset olusturduk
        // sonra o key uzerinden value yi
        Set<Integer> ogrencikeySeti = ogrenciMap.keySet();

        // dondurecegimiz listeyi olusturalim
        List<String> isimlistesi = new ArrayList<>();
        // key degerlerini tek tek elden gecirip istenen degerlerini bulalim
        String value;
        String[] valueArr;
        String istenenIsim;


        for (Integer eachKey : ogrencikeySeti
        ) {

            if (baslangicno <= eachKey && eachKey <= bitisno) {
                // buraya verilen sinir degerlerini uyan
                //eachkey ler gelecek
                // sina uygun value degerini alalim
                value = ogrenciMap.get(eachKey);
                valueArr = value.split("-");
                istenenIsim = valueArr[0] + "" + valueArr[1] + "" + valueArr[4];

                // istenen ismi olusturduk bunu listeye ekleyelim
                isimlistesi.add(istenenIsim);

            }

        }
        return isimlistesi;
    }


    public static void numaraIsimSoyisimYazdir(Map<Integer, String> ogrenciMap) {
        Set<Integer> keySeti = ogrenciMap.keySet();
        String value;
        String[] valueArr;

        for (Integer eachKey : keySeti
        ) {

            value = ogrenciMap.get(eachKey);
            valueArr = value.split("-");// [Ayse, Can, 10, H, MF]

            System.out.println(eachKey + " " + valueArr[0] + " " + valueArr[1]);


        }
    }

    public static Set<String> siraliOgrenciOlustur(Map<Integer, String> ogrenciMapi) {
        Set<String> siraliOgrenciListesiseti = new TreeSet<>();
// tum elementlerin key ve value lerine birlikte ihtiyac oldugundan
        // entry kullanmaliyiz
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMapi.entrySet();

        // her bir entry i
        String istenenBilgi;
        String value;
        String[] valueArr;
        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
        ) {
            value = eachEntry.getValue();
            valueArr = value.split("-");
            istenenBilgi = valueArr[4] + "," + valueArr[2] + "," + valueArr[3] + "," + valueArr[0] + "," + valueArr[1] + "," + eachEntry.getKey();

            siraliOgrenciListesiseti.add(istenenBilgi);
        }

        return siraliOgrenciListesiseti;
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMapi) {
        String istenen;
        String value;
        String[] valueArr;
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMapi.entrySet();
        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
        ) {
            value = eachEntry.getValue();
            valueArr = value.split("-");
            valueArr[1] = valueArr[1].toUpperCase();

            eachEntry.setValue(valueArr[0] + "-" +
                    valueArr[1] + "-" +
                    valueArr[2] + "-" +
                    valueArr[3] + "-" +
                    valueArr[4]);
        }


        return ogrenciMapi;
    }



}