package ders12_forLops;

public class C04_rakamlartoplami {
    public static void main(String[] args) {
        int sayi=1453;
        String sayiStr=""+sayi;
        int birlerbasamagi=0;
        int rakamlartoplami=0;

        for (int i =1; i <=sayiStr .length(); i++){
            birlerbasamagi=sayi%10;
            rakamlartoplami=rakamlartoplami+birlerbasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlartoplami);



    }
}
