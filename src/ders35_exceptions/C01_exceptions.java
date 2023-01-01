package ders35_exceptions;

import java.util.Scanner;

public class C01_exceptions {


    public static void main(String[] args) {
        // kullanicidan bir tam sayi alin
        // ve sayinin karasini yazdirin
        // kullanici ondalikli sayi girerse uyari yazin
        // tekrar sayi isteyon

        Scanner scan = new Scanner (System.in);
        System.out.println("lutfen bir tam sayi girin");
        int girilensayi=scan.nextInt();
        System.out.println(girilensayi*girilensayi);

    }
}
