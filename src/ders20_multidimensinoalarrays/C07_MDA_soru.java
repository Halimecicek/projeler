package ders20_multidimensinoalarrays;

import java.util.Arrays;

public class C07_MDA_soru {
    public static void main(String[] args) {
        // Verilen 2 katli bir array’de ayni index’e sahip elementleri
        // toplayip, yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.

       // input :     int[][] arr = {{3,4,5}, {2,3,6,7}};
       // output:                      [5, 7, 11]
        int[][] arr= {{3,4,5}, {2,3,6,7}};

        int ortakIndexsayisi = arr[0].length<arr[1].length ? arr[0].length: arr[1].length;
        int[] ortakIndextoplamiarr = new int [ortakIndexsayisi];

        for (int i = 0; i <ortakIndextoplamiarr.length ; i++) {

            ortakIndextoplamiarr[i]=arr[0][i]+arr[1][i];


        }
        System.out.println(Arrays.toString((ortakIndextoplamiarr)));
    }
}
