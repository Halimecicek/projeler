package ders04_matematikselislemler;

import java.util.Scanner;

public class C02_datacasting {
    public static void main(String[] args) {
        // kullanicidan iki doble sayi alin ,
        //ilk sayi ikinci sayiya bolun ve bolum isleminin sonucunun tamsayi kismini yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        int bolmesonucutamsayi=(int) (sayi1/sayi2);

        System.out.println(bolmesonucutamsayi);

    }
}
