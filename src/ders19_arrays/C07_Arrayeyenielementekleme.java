package ders19_arrays;

import java.util.Arrays;

public class C07_Arrayeyenielementekleme {
    public static void main(String[] args) {
        int []arr={2,4,6};

        // bu arr e 4. bir element olarak 8 ekleyelim

        /*
        var olan bir arr eleman eklenemez
        ama yeni deger atanabilir
        once[ 2 4 6 8 ] seklinde yeni bir arr olusturup sonra arr2 degerini arr ye atayabiliriz

         */
        int[]arr2=new int [arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];

        }
        System.out.println(Arrays.toString(arr2));
        arr2[arr2.length-1]=8;
        System.out.println(Arrays.toString(arr2));

        // arr arrray i na yeni olusturdugumuz arr2 i atanacak
        arr=arr2;
        System.out.println("arr nin son hali :"  +Arrays.toString(arr));
    }
}
