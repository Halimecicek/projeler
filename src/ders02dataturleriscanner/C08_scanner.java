package ders02dataturleriscanner;

import java.util.Scanner;

public class C08_scanner {

    public static void main(String[] args) {
     // kullanicidan iki sayi alip ikisinin de degerini degistirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen birinci tamsayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen ikinci tamsayiyi giriniz");
        int sayi2= scan.nextInt();

        int bos;
        bos=sayi2;
        sayi2=sayi1;
        sayi1=bos;
        System.out.println("sayibirin degeri "+sayi1);
        System.out.println("sayiikinin degeri"+sayi2);
    }
}
