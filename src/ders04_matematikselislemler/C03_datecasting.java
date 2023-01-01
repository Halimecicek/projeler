package ders04_matematikselislemler;

import java.util.Scanner;

public class C03_datecasting {
    public static void main(String[] args) {
        // kullanicidan iki integer deger alip bunlari birbirine bolun ve
        //sonucu double yapin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println(sayi1/sayi2);

        double ondaliklisonuc= (double)(sayi1/sayi2);

        System.out.println(ondaliklisonuc);

        double dogrusonuc=(double) sayi1/sayi2; //double/int = genis olana gore sonuc verir

        System.out.println(dogrusonuc);




    }
}
