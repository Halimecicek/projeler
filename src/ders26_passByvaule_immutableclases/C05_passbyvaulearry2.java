package ders26_passByvaule_immutableclases;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_passbyvaulearry2 {
    public static void main(String[] args) {
        // bir method olusturun
        // sayilar array in  uzunlugundan 2 fazla olan ve elementlerin tamami 5 olan yeni array olusturup
        // deger olarak sayilar array in atayin ve sayilar array ini yazdirin

        int [] sayilar={3,4,5};
        arrayeyenidegerata(sayilar);
        System.out.println(Arrays.toString(sayilar));

    }
    public static void arrayeyenidegerata(int[]sayilar){
        int[] yeniarray= new int[sayilar.length+2];

        for (int i = 0; i <yeniarray.length ; i++) {
            yeniarray[i]=5;

        }
        System.out.println("method da ki sayilarin son hali :"+Arrays.toString(sayilar));

    }
}
