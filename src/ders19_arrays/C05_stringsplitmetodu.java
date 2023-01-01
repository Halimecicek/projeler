package ders19_arrays;

import java.util.Arrays;

public class C05_stringsplitmetodu {
    public static void main(String[] args) {

        String str= "java gercekten cok cok guzel ";
        String[] eArrayi=str.split("e");
        System.out.println(eArrayi.length);


        System.out.println("metindeki e sayisi :"+(eArrayi.length-1));


        String[]tumkarakterlerArr=str.split("");
        System.out.println(Arrays.toString(tumkarakterlerArr));

        int sayac=0;
        // bir loop ile tum karakterleri kontrol edelim



        for (int i = 0; i <tumkarakterlerArr.length ; i++) {
            if (tumkarakterlerArr[i].equals("e")){
                sayac++;
            }
        }
        System.out.println("Metindeki e sayisi : " + sayac);

        }

    }

