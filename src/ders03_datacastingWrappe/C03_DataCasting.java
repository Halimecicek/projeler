package ders03_datacastingWrappe;

import java.util.Scanner;

public class C03_DataCasting {


    public static void main(String[] args) {
        //kullanicidan bir tam sayi alin
        //kullanici kac girerse girsin
        //konsolda -128 ile + 127 arasinda bir sonuc yyazdiracak
        // kod yazin
        Scanner scann = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz ");
        int girilensayi = scann.nextInt();
        byte donusensayi = (byte)girilensayi;
        System.out.println("girdiginiz"+girilensayi+"nin donusmus hali:"+donusensayi);


    }
}
