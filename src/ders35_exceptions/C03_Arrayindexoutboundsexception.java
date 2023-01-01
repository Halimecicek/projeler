package ders35_exceptions;

import java.util.Scanner;

public class C03_Arrayindexoutboundsexception {
    public static void main(String[] args) {
        // kullanicidan bir index isteyin
        // verilen bir array den kulllanicinin girdigi indexi elementlerin yazdirin

        int [] arr= {3,5,6,7,8,2,3,5,6,8,9,1};
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir index giriniz");
        int index= scan.nextInt();

        try {
            System.out.println(arr[index]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
