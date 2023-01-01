package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_trycatch {
    public static void main(String[] args) {
        /* Kullanıcıdan istedğişi kadar sayı girmesini isteyip
            Girilen sayıları toplayın
            kullanıcının işlemi bitirmek için Q'ya basmasını isteyin Q'ya basıldığında
            toplam kaç sayı girdiğini  ve bu sayıların toplamının kac  oldugunu yazdırın
         */
        Scanner scan = new Scanner(System.in);
        double girilensayi=0;
        double sayilarintoplami=0;
        int sayac=0;
        boolean devam=true;

        while (devam){
            System.out.println("toplamak uzere sayi giriniz.\nbitirmek icin Q ya basiniz");



            try {
                girilensayi= scan.nextDouble();
                sayilarintoplami+=girilensayi;
                sayac++;

            } catch (InputMismatchException e) {

                String str=scan.next();
                if(str.equalsIgnoreCase("Q")){
                    break;
                }

            }


        }

        System.out.println("girilen"+sayac+"adet sayisinin toplami:"+sayilarintoplami);

    }
}
