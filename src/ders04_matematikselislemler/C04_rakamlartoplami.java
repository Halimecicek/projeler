package ders04_matematikselislemler;

public class C04_rakamlartoplami {
    public static void main(String[] args) {
        // kulanicinin girdigi 4 basamakli bir sayinin
        // rakamlar toplami veren bir kod yaziniz
        int input=1453;
        int birlerbasamagi=0;
        int rakamlartoplami=0;

        birlerbasamagi=input % 10; //3
        // birler basamagini rakamlar toplamina ekle
                rakamlartoplami = rakamlartoplami +birlerbasamagi; //3
        input=input/10;

        birlerbasamagi=input % 10; //
        rakamlartoplami = rakamlartoplami +birlerbasamagi; // 5
        input=input/10;

        birlerbasamagi=input % 10; //
        rakamlartoplami = rakamlartoplami +birlerbasamagi; // 4
        input=input/10;

        birlerbasamagi=input % 10; //
        rakamlartoplami = rakamlartoplami +birlerbasamagi; // 1
        input=input/10;

        System.out.println("verilen sayinin rakamlar toplami:"+ rakamlartoplami);
    }
}
