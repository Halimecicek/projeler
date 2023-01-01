package ders46_Maps;

import ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_EntrySer {
    public static void main(String[] args) {

        //onceki iki derste key ve value degerlerini toplu olaarak alabiliyorduk
        // ancak key ve value birlikte kullanmak zor oluyor

        Map<Integer, String> ogrenciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.size());

        ogrenciMap.put(108,"");


        Set<Map.Entry<Integer,String>>ogrencientrySeti = ogrenciMap.entrySet();
        System.out.println(ogrencientrySeti);

        int siraNo=1;
        for (Map.Entry<Integer,String>eachEntry:ogrencientrySeti
             ) {
            System.out.println(siraNo+" "+eachEntry);
            siraNo++;

        }

        // entry leri kullanarak keyleri yazdirin

        for (Map.Entry<Integer,String> eachEntry:ogrencientrySeti
             ) {
            System.out.println(eachEntry.getKey());
        }

        String entryValue;
        String [] entryValuArr;

        for (Map.Entry<Integer,String>eachEntry:ogrencientrySeti
             ) {
            entryValue=eachEntry.getValue();
            entryValuArr=entryValue.split("-");

            if (entryValuArr[2].equals("12")){

                eachEntry.setValue("mezun oldu");

            }else {
                int sinif =Integer.parseInt(entryValuArr[2]);
                sinif++;
                entryValuArr[2]=sinif+"";
                        eachEntry.setValue(entryValuArr[0]+"-"+
                                           entryValuArr[1]+"-"+
                                           entryValuArr[2]+"-"+
                                           entryValuArr[3]+"-"+
                                           entryValuArr[4]+"-");

            }
        }


        System.out.println(ogrenciMap);


    }
}
