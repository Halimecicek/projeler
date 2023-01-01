package ders03_datacastingWrappe;

import java.util.Scanner;

public class C04_DateCastingChar {

    public static void main(String[] args) {

        System.out.println('a'+'b');
        // kullanicidan char bir karakter alin o karakterden sonra gelan 3 karakteri yazdirin

        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir karakter");

        char girilenkrk= scann.next().charAt(0);

        System.out.println(""+(char)(girilenkrk+1)+(char)(girilenkrk+2)+(char)(girilenkrk+3));
        // sayisal deger degilde
        // onun yerine giren karakter den sonra ne geldigini yazmak icin () icinde char yaziyoruz ki
        //  a yazdik bcd yazsin deger toplami yerine
    }
}
