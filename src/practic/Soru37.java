package practic;

public class Soru37 {
    public static void main(String[] args) {
        //  3 ile 14 arasındaki tam sayıların toplamını bulmak için kod yazınız.

        int sayi=3;
        int toplam=0;
        do {
            toplam=toplam+sayi;

            sayi++;

        }while (sayi<=14);

        System.out.println(toplam);
    }
}
