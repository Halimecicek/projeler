package ders47_Mapsmethodlari;

import java.util.HashMap;
import java.util.Map;

public class C04_Soru {
    public static void main(String[] args) {
        // verilen bir cumlede kullanilan karakterleri
        // ve kacar kere kullandiginizi yazin


        String str=" Java balonu patlatmadan bitirelim";

        String []strArr=str.split("");
        Map<String,Integer>kullanimMiktariMap=new HashMap<>();
        for (int i = 0; i <strArr.length ; i++) {
            // ele aldigim element msp de yoksa kullanim miktarlari 1 olarak map a ekleyecegim


            kullanimMiktariMap.computeIfPresent(strArr[i],(k,v)->v+1);

            kullanimMiktariMap.putIfAbsent(strArr[i],1);
        }
        System.out.println(kullanimMiktariMap);
    }
}
