package ders15_ovorloading_whileoop;

public class C08_soru {
    public static void main(String[] args) {
        // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        int sayi=1453;

        int birlerbasamagi=0;
        int rakamlartoplami=0;


        while (sayi!=0){

            birlerbasamagi=sayi%10;
            rakamlartoplami+=birlerbasamagi;
            sayi/=10;


        }

        System.out.println(rakamlartoplami);
    }
}
