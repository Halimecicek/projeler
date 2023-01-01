package practic;

import java.util.Scanner;

public class Soru6 {
    /*
    Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
oluşturmak için kod yazınız.
a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0"yazmalıdır.
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("yapmak istediginiz islemi seciniz");
        System.out.println("1.+\n 2.-\n 3.*\n 4./");
        double islem = scan.nextDouble();
        if (islem == 1)
            System.out.println("girdiginiz sayilarin toplami" + (sayi1 + sayi2));
        else if (islem==2)
            System.out.println("girdiginiz sayilarin farki="+(sayi1-sayi2));
        else if (islem==3)
            System.out.println("girdiginiz sayilarin carpimi="+(sayi1*sayi2));
        else if (islem==4)
            System.out.println("girdiginiz sayilarin bolumu="+(sayi1/sayi2));
        else System.out.println("hatali giris yaptiniz");


        System.out.println("==================================================");

        double say1=10.2;
        double say2=3.5;

        String islem1="-";

        if (islem1.equals("+")){
            System.out.println(sayi1+sayi2);
        } else if (islem1.equals("-")) {
            System.out.println(sayi1-sayi2);
        } else if (islem1.equals("*")) {
            System.out.println(sayi1*sayi2);
        } else if (islem1.equals("/")) {
            System.out.println(sayi1/sayi2);
        }else {
            System.out.println("lutfen gecerli islem giriniz");}
    }



}
