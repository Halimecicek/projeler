package ders26_passByvaule_immutableclases;

import java.util.Arrays;

public class C03_pasbyvalue {
    public static void main(String[] args) {
        // verilen bir array in elementlerini 5 artirip
        // sonra yazdiran bir method olusturun
        int[]arr={3,4,5};
        elementleri5art(arr);
        elementleri5art(arr);
        elementleri5art(arr);

        System.out.println("method call dan sonra main method icinde arr:"+Arrays.toString(arr));

    }
    public static void elementleri5art(int []arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]+5;

        }
        System.out.println(Arrays.toString(arr));
    }
}
