package ders19_arrays;

import java.util.Arrays;

public class C02_enbuyukenkucukelementbulma {

    public static void main(String[] args) {
        int[]arr={3,8,1,5,2,9};
        enkucukenbuyukelementyazdir(arr);
        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        //   yazdiran bir method olusturun

    }

    public static void enkucukenbuyukelementyazdir(int[]arr){

        Arrays.sort(arr);

        System.out.println("en buyuk element:"+arr[arr.length-1]);
        System.out.println("en kucuk element:"+arr[0]);
        }


}
