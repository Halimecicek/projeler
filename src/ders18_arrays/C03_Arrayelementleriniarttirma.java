package ders18_arrays;

import java.util.Arrays;

public class C03_Arrayelementleriniarttirma {
    public static void main(String[] args) {
        // Soru 1- Verilen bir int array’in tum elemanlarini
        // 2 artirip bize donduren bir method olusturun. Eski array’i yeni haliyle kaydedin.
        int[] arr={2,4,6,8};

        for (int i = 0; i <arr.length ; i++) {

            arr[i]=arr[i]+2;


        }
        System.out.println(Arrays.toString(arr)); // 4, 6, 8 ,10


        arr=elementleriikiartir(arr);
    }

    public static int[] elementleriikiartir(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]+2;


        }
        return arr;

    }
}