package practic;

public class Soru31 {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.



        int toplam=0;

        int sayi=7435;

        while (sayi!=0) {

            toplam+=sayi%10;

            sayi/=10;

        }
        System.out.println(toplam);
    }
}
