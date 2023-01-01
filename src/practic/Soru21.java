package practic;

import java.util.Scanner;

public class Soru21 {
    public static void main(String[] args) {
        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
*/
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        char islem =scan.next().charAt(0);
        hesapmakinesi(islem , sayi1,sayi2);
    }

    public static void hesapmakinesi(char islem , double sayi2,double sayi1){


    }


}
