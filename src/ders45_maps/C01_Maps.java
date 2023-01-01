package ders45_maps;

import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {
        // verlilen bir cumlede kullanilan her bir harfi
        // ve o harfin kullanim miktarini
        // A=5 b=3 gibi yazdirin

        String str= "javayi balonu patlatmadan bitirelim";
        // j=1 a=7 v=1 y=1.....

        String [] harflerArr=str.split("");

        Map<String,Integer>kullanimMiktariMap=new TreeMap<>();
        int sayac=1;
              // 1- tum harfleri sirasi ile ele alacagiz
        for (int i = 0; i < harflerArr.length ; i++) {
            if (kullanimMiktariMap.containsKey(harflerArr[i])){
                continue;
            }else {
                // Kod buraya geldiyse o harf henuz map'e eklenmemistir.
                // o zaman bu harfin kullanim miktarini bulmaliyiz
                for (int j =i+1; j < harflerArr.length ; j++) {
                    if (harflerArr[j].equals(harflerArr[i])){
                        sayac++;
                    }

                }
                // sayma islemi bitti, Key ve Value'yu map'e ekleyelim

                kullanimMiktariMap.put(harflerArr[i],sayac ) ;
                sayac=1;
            }
        }
        System.out.println(kullanimMiktariMap);
    }
}
