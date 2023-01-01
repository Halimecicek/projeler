package ders02dataturleriscanner;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {

           // kullanicidan bir double, birde int sayi alip
         // bunlarin toplamini ve carpimini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen ondalikli bir sayi giriniz");
        double ondalikliSayi = scan.nextDouble();

        System.out.println("lutfen bir tam sayi giriniz");
        int tamsayi = scan.nextInt();

        System.out.println("girilen sayilarin toplami:"+ (ondalikliSayi+tamsayi));

        System.out.println("girilen sayilarin carpimi:"+ (ondalikliSayi*tamsayi));


    }
}
